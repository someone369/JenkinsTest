package Sample.FrameWork.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sample.FrameWork.Utils.PageObjects;
import Sample.FrameWork.testBase.BaseSetUp;


/**
 * @author Sreekanth
 *
 */
public class Download extends  BaseSetUp{
	@BeforeTest
	public void open() throws Exception{
		openBrowser();
	}
	@AfterTest
	public void closeBrowser(){
		closeBrowsers();
	}
	/**
	 * This vethod 	
	 * @throws Exception
	 */
	@Test
	public void downloadpage() throws Exception{
		System.out.println("Git test");
	}
	/**
	 * This method verifyes posi
	 */
	@Test(dependsOnMethods = "downloadpage")
	public void loginVerification(){
		
	}
}
