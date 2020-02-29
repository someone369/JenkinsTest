package Sample.FrameWork.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sample.FrameWork.Utils.PageObjects;
import Sample.FrameWork.testBase.BaseSetUp;

public class LogIn extends  BaseSetUp{
	public WebDriverWait wait;
	
		@BeforeTest
		public void TestStart() throws Exception{
			openBroser();
			System.out.println("LogIn Test Sratred");
		}
		
		@Test
		public void homePage_ClickOnLoginButton(){
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObjects.AUTOMATIONPRACTICE_SIGN_LINK_XPATH)));
			System.out.println("Successfully enter in to home page");
			
			driver.findElement(By.xpath(PageObjects.AUTOMATIONPRACTICE_SIGN_LINK_XPATH)).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObjects.AUTOMATIONPRACTICE_SIGNIN_SUBMIT_BUTTIN_XPATH)));
			System.out.println("Successfully enter in to Login page");
		}
		
		@Test(dependsOnMethods = "homePage_ClickOnLoginButton")
		public void enterCredentials(){
			String Username = "useforoverall@gmail.com";
			String Password = "9010971770";
			loginTest(Username, Password, PageObjects.AUTOMATIONPRACTICE_USERNAME_EMAIL_XPATH, PageObjects.AUTOMATIONPRACTICE_PASSWORD_XPATH);
			driver.findElement(By.xpath(PageObjects.AUTOMATIONPRACTICE_SIGNIN_SUBMIT_BUTTIN_XPATH)).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObjects.AUTOMATIONPRACTICE_HOME_BUTTON)));
			System.out.println("Successfully logedin");
		}
		
		@AfterTest
		public void Testend(){
			System.out.println("LogIn Test Ended");
			closeBrowsers();
		}
		
}
