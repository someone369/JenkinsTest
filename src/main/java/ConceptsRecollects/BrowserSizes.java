package ConceptsRecollects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.beans.property.SetProperty;

public class BrowserSizes {

	public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://browsersize.com/");
			Dimension dimention = new Dimension(640, 480);
			driver.manage().window().setSize(dimention);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			dimention = new Dimension(1600, 1200);
			driver.manage().window().setSize(dimention);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.manage().window().fullscreen();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Point point = driver.manage().window().getPosition();
			System.out.println("Current position ofthe window is : "+point);
			driver.manage().window().setPosition(new Point(640, 480));
	}

}
