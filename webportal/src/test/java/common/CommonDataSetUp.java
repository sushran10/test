package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetUp {
	
	@BeforeSuite
	public void dataSetUp()
	{
		System.out.println("common data set up");
	}
	@AfterSuite
	public void dataTeardown()
	{
		System.out.println("common data clean up");
	}

}
