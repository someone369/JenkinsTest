package saucelabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLabsDemo {

	private WebDriver driver;

	  @Test 
	  public void shouldOpenSafari() throws MalformedURLException {
	    /**
	     * In this section, we will configure our SauceLabs credentials in order to run our tests on saucelabs.com
	     */
	    String sauceUserName = "aautomationtest";
	    String sauceAccessKey = "e6716d1b-c410-48d6-af42-cb7090a882c1";

	    /**
	     * In this section, we will configure our test to run on some specific
	     * browser/os combination in Sauce Labs
	     */
	    DesiredCapabilities capabilities = new DesiredCapabilities();

	    //set your user name and access key to run tests in Sauce
	    capabilities.setCapability("username", sauceUserName);

	    //set your sauce labs access key
	    capabilities.setCapability("accessKey", sauceAccessKey);

	    //set browser to Safari
	    capabilities.setCapability("browserName", "Safari");

	    //set operating system to macOS version 10.13
	    capabilities.setCapability("platform", "macOS 10.13");

	    //set the browser version to 11.1
	    capabilities.setCapability("version", "11.1");

	    //set your test case name so that it shows up in Sauce Labs
	   // capabilities.setCapability("name", testInfo.getDisplayName());

	    driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);

	    //navigate to the url of the Sauce Labs Sample app
	    driver.navigate().to("https://www.saucedemo.com");

	    //Create an instance of a Selenium explicit wait so that we can dynamically wait for an element
	    WebDriverWait wait = new WebDriverWait(driver, 5);

	    //wait for the user name field to be visible and store that element into a variable
	    By userNameFieldLocator = By.cssSelector("[type='text']");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(userNameFieldLocator));

	    //type the user name string into the user name field
	    driver.findElement(userNameFieldLocator).sendKeys("standard_user");

	    //type the password into the password field
	    driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");

	    //hit Login button
	    driver.findElement(By.cssSelector("[type='submit']")).click();

	    //Synchronize on the next page and make sure it loads
	    By inventoryPageLocator = By.id("inventory_container");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryPageLocator));

	    //Assert that the inventory page displayed appropriately
	    Boolean result = driver.findElements(inventoryPageLocator).size() > 0;
	    Assert.assertTrue(result);

	    /**
	     * Here we teardown the driver session and send the results to Sauce Labs
	     */
	    if (result){
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
	      System.out.println("Test is passed");
	    }
	    else {
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
	      System.out.println("Test is Failed");
	    }
	    driver.quit();

	  }

}
