package locators;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sample.FrameWork.Utils.PageObjects;
import Sample.FrameWork.testBase.BaseSetUp;

public class Csstest extends BaseSetUp{
		@BeforeTest
		public void browser_configurations() throws Exception{
			
			String Url = "https://www.paypal.com/in/home";
			openBrowser_url(Url);
		}
		
		@Test
		public void home_page_verification(){
			
			element_Clickable_Css(PageObjects.PAYPALL_SIGN_LINK_CSS);
			System.out.println("User is successfully launched Home page");
			
			System.out.println("Title of the page is : "+driver.getTitle());
		}
		
		@Test(dependsOnMethods = "home_page_verification")
		public void blaze_Meter(){
			String blazeUrl = "https://guide.blazemeter.com/hc/en-us";
			driver.navigate().to(blazeUrl);
			element_Clickable_Css(PageObjects.GETTING_STARTED_CSS);
			
			findElement_css(PageObjects.GETTING_STARTED_CSS).click();
			
			driver.navigate().to("https://www.hubspot.com/");
			element_Clickable_Css(PageObjects.HUBSPOT_LINK_CSS);
			
			findElement_css(PageObjects.HUBSPOT_LINK_CSS).click();
			
		}
		
		@AfterTest
		public void closeBrwser(){
			closeBrowsers();
		}
		
		
		
		
}
