package AutoItConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sample.FrameWork.Utils.PageObjects;
import Sample.FrameWork.testBase.BaseSetUp;

public class AutoItTest extends BaseSetUp{
		
	@BeforeTest
	public void browseConfig() throws Exception{
		
		// the url is the one which we created for our purpose
		String Url = "https://tus.io/demo.html";
		openBrowser_url(Url);
	}
	
	@Test
	public void filrupload() throws Exception{
		System.out.println("browser opened");
		
		findElement_xpath("(//input[@type='file'])[1]").sendKeys("G:\\Workspace2\\JenkinsTest\\src\\main\\java\\UploadFile\\wp5166309-jack-sparrow-computer-hd-wallpapers.jpg");
		/*Thread.sleep(5000);
		Runtime.getRuntime().exec("G:\\Workspace2\\JenkinsTest\\src\\main\\java\\UploadFile\\autTest.exe");*/
	}
	

}
