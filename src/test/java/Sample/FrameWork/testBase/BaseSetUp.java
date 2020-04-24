package Sample.FrameWork.testBase;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import Sample.FrameWork.Utils.PageObjects;

public class BaseSetUp {

	public static WebDriver driver;
	public static Properties prop;
	FileInputStream ip;

	@BeforeSuite
	public void loadConfig() throws Exception {
		prop = new Properties();
		ip = new FileInputStream("resources//Config.properties");
		prop.load(ip);
	}

	public WebDriver getDriver() throws Exception {

		String browser = prop.getProperty("browserName");
		System.out.println("Opening browser is :" + browser);
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			return new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			return new FirefoxDriver();
		}
	}

	public void openBrowser() throws Exception {
		driver = getDriver();
		driver.get(baseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	/*
	 * This method will take care browser configurations with this method we are
	 * able to pass desired URL dynamically
	 */
	public void openBrowser_url(String Url) throws Exception {
		driver = getDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void closeBrowsers() {
		driver.quit();
	}

	public String baseUrl() {
		String BaseURL = "http://automationpractice.com/";
		return BaseURL;
	}

	/*
	 * This method will login when you provide Username and Password as send
	 * keys usernameElement and PasswordElement as the elements dynamically
	 */
	public void loginTest(String Username, String Password, String UsernameElement, String PasswordElement) {
		driver.findElement(By.xpath(UsernameElement)).sendKeys(Username);
		driver.findElement(By.xpath(PasswordElement)).sendKeys(Password);
	}

	// This method will help to find element with xpath
	public WebElement findElement_xpath(String element) {
		return driver.findElement(By.xpath(element));
	}

	// This method will help to find element with Id
	public WebElement findElement_id(String element) {
		return driver.findElement(By.id(element));
	}

	// This method will help to find element with cssSelector
	public WebElement findElement_css(String element) {
		return driver.findElement(By.cssSelector(element));
	}

	// This method will help to find element with name
	public WebElement findElement_name(String element) {
		return driver.findElement(By.name(element));
	}

	/*
	 * This is the webDriver wait method useful for wait untill element is
	 * clickable when user used locator as Xpath
	 */
	public void element_Clickable_xpth(String element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	}
	
	/*
	 * This is the webDriver wait method useful for wait untill element is
	 * clickable when user used locator as Name
	 */
	public void element_Clickable_name(String element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.name(element)));
	}
	
	/*
	 * This is the webDriver wait method useful for wait untill element is
	 * clickable when user used locator as Css
	 */
	public void element_Clickable_Css(String element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(element)));
	}
	
	/*
	 * This is the webDriver wait method useful for wait untill element is
	 * clickable when user used locator as Id
	 */
	public void element_Clickable_Id(String element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
	}
	
	public void saucelabsConfig(String sauceUserName, String sauceAccessKey) throws MalformedURLException{
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
	    capabilities.setCapability("version", "latest");

	    //set your test case name so that it shows up in Sauce Labs
	    capabilities.setCapability("tunnelIdentifier", "SauceTester");	
	    
	   // capabilities.setCapability("name", testInfo.getDisplayName());

	    driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);

	    
	}
}
