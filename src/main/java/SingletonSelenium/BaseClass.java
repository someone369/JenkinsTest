package SingletonSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	private WebDriver driver;
	private static BaseClass obj = null;

	private BaseClass() {
		System.out.println("Driver object created");
	}

	public static BaseClass getInstance() {
		if (obj == null)
			obj = new BaseClass();
		return obj;
	}

	public WebDriver initilizeBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("App opening in Chrome Browser");
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("App opening in Firefox Browser");
		} else {
			System.out.println("Desired browser not available ");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
}
