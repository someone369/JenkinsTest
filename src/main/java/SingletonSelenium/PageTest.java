package SingletonSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTest {
		
	WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		BaseClass instanceDriver = BaseClass.getInstance();
		driver = instanceDriver.initilizeBrowser(ConstantVariables.browserName);
		driver.get(ConstantVariables.Url);
	}
	@Test
	public void title(){
		String actualTitle = driver.getTitle();
		System.out.println("Title of the page is : "+actualTitle);
		String ExpertedTitle = "Singleton Class Java & How to implement With Selenium WebDriver In Real time?";
		Assert.assertEquals(actualTitle, ExpertedTitle);
	}
	@AfterTest
	public void CloseBrowser(){
		driver.quit();
	}

}
