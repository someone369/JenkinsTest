package windowHandling;

import java.util.Iterator;
import java.util.Set;
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

public class WidowHandling {
	public static WebDriver driver;
	public static WebDriverWait wait;
		@BeforeTest
		public void beforetest(){
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Windows.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@Test
		public void Windowhandle() throws Exception{
			System.out.println("Entered in test");
			driver.findElement(By.xpath("//button[text()='    click   ']")).click();;
			/*wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(sortable));
			System.out.println("wait successfull");
			sortable.click();*/
			System.out.println("Clicked");
			Set<String> windowIds = driver.getWindowHandles();
			Iterator<String> itr = windowIds.iterator();
			
			String parentWindow = itr.next();
			System.out.println("Parent window window Id is : "+parentWindow);
			
			String childWindow = itr.next();
			System.out.println("child window window Id is : "+childWindow);
			
			driver.switchTo().window(childWindow);

			System.out.println("Title of the opend window is : "+driver.getTitle());
			Thread.sleep(5000);
			driver.switchTo().window(parentWindow);
			System.out.println(driver.getTitle());
		}
		
		@AfterTest
		public void close(){
			driver.quit();
		}
}
