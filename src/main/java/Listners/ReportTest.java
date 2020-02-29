package Listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(LIstnersTest.class)

public class ReportTest {
	
	@Test
	public void passTest(){
		Assert.assertTrue(true);
		System.out.println("This Test passed");
	}
	
	@Test(dependsOnMethods = "passTest")
	public void failedTest(){
		System.out.println("This test is going to failed");
		Assert.assertTrue(false);
	}
}
