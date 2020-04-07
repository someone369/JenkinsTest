package AuthPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
		public static void main(String[] args) {
			
			String Username = "admin";
			String password = "admin";
			
			String actual_Url = "https://the-internet.herokuapp.com/basic_auth";
			
			String Url = "https://"+Username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
			
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			
			driver.get(Url);
			System.out.println("Title of the page is : "+driver.getTitle());
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			driver.quit();
			
		}
}
