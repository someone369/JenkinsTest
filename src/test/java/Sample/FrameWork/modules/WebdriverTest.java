package Sample.FrameWork.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTest {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/net.sourceforge.htmlunit/webdriver/2.6");
		String title = driver.getTitle().toString();
		System.out.println("Browser Title : "+title);
		driver.quit();
	}

}
