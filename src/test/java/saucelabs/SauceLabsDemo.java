package saucelabs;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceLabsDemo {

	@Test
	public void runSauce() throws Exception {
		WebDriver driver;

		final String USERNAME = "aautomationtest";
		final String ACCESS_KEY = "e6716d1b-c410-48d6-af42-cb7090a882c1";
		final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "latest");
		browserOptions.setCapability("sauce:options", sauceOptions);

		driver = new RemoteWebDriver(new URL(URL), browserOptions);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hi lakshmi");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("Title of the page is : " + driver.getTitle());
		driver.quit();
		System.out.println("Tests compleated");
	}

}
