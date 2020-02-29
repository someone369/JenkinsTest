package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LIstnersTest implements ITestListener{

	public void onFinish(ITestContext Result) {
		System.out.println("Test Suite Finished is : "+Result.getName());
	}

	public void onStart(ITestContext Result) {
		System.out.println("Test Suite Started is : "+Result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
	}

	public void onTestFailure(ITestResult Result) {
		System.out.println("Test failed is : "+Result.getName());
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("Test Skipped is : "+Result.getName());
	}

	public void onTestStart(ITestResult Result) {
		System.out.println("Test Started is : "+Result.getName());
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("Test Success is : "+Result.getName());
	}

}
