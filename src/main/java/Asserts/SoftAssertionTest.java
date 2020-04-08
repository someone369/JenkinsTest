package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	
	@Test
	public void first(){
		
		SoftAssert soft = new SoftAssert();
		System.out.println("First Test Started");
		
		soft.assertTrue(false);
		System.out.println("First Test Executed");
		soft.assertAll();
	}
	
	@Test
	public void second(){
		System.out.println("Second test Started");
		Assert.assertTrue(false);
		System.out.println("Second test Executed");
	}
}
