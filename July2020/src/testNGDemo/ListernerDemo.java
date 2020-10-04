package testNGDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerDemo implements ITestListener {

	public void onStart(ITestContext result) {
		System.out.println("onStart "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped "+result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess "+result.getName());
	}

	public void onFinish(ITestContext result) {
		System.out.println("onFinish "+result.getName());
	}
	
	
	

}
