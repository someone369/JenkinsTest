package WebdriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerTest {

	public static void main(String[] args) {
		
		/*
		 * when we use webdriverManager no need to set the properties it will take care about the driver setup
		 */
		WebDriverManager.chromedriver().version("70.0").setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/3.8.1");
		
		System.out.println("Title of the page is : "+driver.getTitle());
		
		driver.quit();
	}

}
