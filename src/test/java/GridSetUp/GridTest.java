package GridSetUp;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	
	
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		DesiredCapabilities cap1 = new DesiredCapabilities();
		cap1.setBrowserName("chrome");
		cap1.setPlatform(Platform.WIN10);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap1);
		
		String hubUrl = "http://192.168.43.248:4444/wd/hub";
		
		 driver = new RemoteWebDriver(new URL(hubUrl), cap1);
		
		driver.get("http://seleniumhq.org/");
		System.out.println("Titleof thepage is : "+driver.getTitle());
		
		driver.quit();
	}
}
