package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sample.FrameWork.testBase.BaseSetUp;

public class javaScriptExeMethods extends BaseSetUp{
		
	@BeforeTest
	public void browserconfig() throws Exception{
		String Url = "http://demo.automationtesting.in/Register.html";
		openBrowser_url(Url);
	}
	
	@Test
	public void javaScriptMethods() throws Exception{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println("Title of the page is : "+title);
		
		// here querySelector means CssSelector
		js.executeScript("document.querySelector(\"input[placeholder='First Name']\").value='lakshmi'");
		
		Thread.sleep(3000);
		//below line means refresh the page
		js.executeScript("history.go(0)");
		
		js.executeScript("document.querySelector(\"a[href='Index.html']\").click()");
		Thread.sleep(3000);
		
		String getText = js.executeScript("return document.getElementById('btn2').innerHTML").toString();
		System.out.println("Text of the string : "+getText);
		
		js.executeScript("document.getElementById('enterimg').click()"); 
		
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.getElementById('submitbtn').scrollIntoView");
		Thread.sleep(3000);
		js.executeScript("window.history.back()");
		
		js.executeScript("window.history.forward()");
	}
	
	@AfterTest
	public void closebroser(){
		closeBrowsers();
	}
}
