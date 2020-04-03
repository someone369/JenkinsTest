package Sample.FrameWork.modules;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sample.FrameWork.Utils.PageObjects;
import Sample.FrameWork.testBase.BaseSetUp;

public class LogIn extends BaseSetUp{
	
		@BeforeTest
		public void TestStart() throws Exception{
			openBroser();
			System.out.println("LogIn Test Sratred");
		}
		@AfterTest
		public void Testend(){
			System.out.println("LogIn Test Ended");
			closeBrowsers();
		}
		@Test
		public void homePage_ClickOnLoginButton(){
			element_Clickable_xpth(PageObjects.AUTOMATIONPRACTICE_SIGN_LINK_XPATH);
			System.out.println("Successfully enter in to home page");
			
			findElement_xpath(PageObjects.AUTOMATIONPRACTICE_SIGN_LINK_XPATH).click();
			element_Clickable_xpth(PageObjects.AUTOMATIONPRACTICE_SIGNIN_SUBMIT_BUTTIN_XPATH);
			System.out.println("Successfully enter in to Login page");
		}
		
		@Test(dependsOnMethods = "homePage_ClickOnLoginButton")
		public void enterCredentials(){
			String Username = "useforoverall@gmail.com";
			String Password = "9010971770";
			loginTest(Username, Password, PageObjects.AUTOMATIONPRACTICE_USERNAME_EMAIL_XPATH, PageObjects.AUTOMATIONPRACTICE_PASSWORD_XPATH);
			
			findElement_xpath(PageObjects.AUTOMATIONPRACTICE_SIGNIN_SUBMIT_BUTTIN_XPATH).click();
			element_Clickable_xpth(PageObjects.AUTOMATIONPRACTICE_HOME_BUTTON);
			System.out.println("Successfully logedin");
		}
		
		
		
}
