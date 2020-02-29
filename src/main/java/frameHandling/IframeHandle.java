package frameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeHandle {
	public static WebDriver driver;
	public static WebDriverWait wait;
		@BeforeTest
		public void beforetest(){
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		@Test
		public void frameSwitch(){
			driver.switchTo().frame("SingleFrame");
			WebElement sortable = driver.findElement(By.xpath("//input[@type='text']"));

			wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(sortable));
			sortable.sendKeys("Lakshmi");
			driver.switchTo().defaultContent();
			
			
		/* But there Three ways to switch in to frame
		 * 1. driver.switchTo().frame(indexnumber);
		 * 2. driver.switchTo().frame(“framename”);
		 * 3. WebElement button=driver.findElement(By.xpath(""));
		 * 	  driver.switchTo().frame(button);
		 */
		}
		@AfterTest
		public void close(){
			driver.close();
		}
}
