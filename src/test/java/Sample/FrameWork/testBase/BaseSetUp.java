package Sample.FrameWork.testBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

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

	public void openBroser() throws Exception {
		driver = getDriver();
		driver.get(baseUrl());
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
	
	public void loginTest(String Username, String Password, String UsernameElement, String PasswordElement){
		driver.findElement(By.xpath(UsernameElement)).sendKeys(Username);
		driver.findElement(By.xpath(PasswordElement)).sendKeys(Password);
	}
}
