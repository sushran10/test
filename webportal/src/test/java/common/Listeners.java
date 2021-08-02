package common;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener { 
	
	public void onTestStart(ITestResult result)
	{
	System.out.println("test case starting");	
	}
	
	public void onTestSuccess(ITestResult result)
	{
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test failed- screen shot captured");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
}
