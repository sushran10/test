package ui;
import org.testng.SkipException;
import org.testng.annotations.Test;

import common.CommonDataSetUp;

public class SkipDemoTest {
	
	Boolean datasetup= true; //2 is skipped,3 passed
	
	@Test(enabled = false)  //not ready 
	public void skipTest1()
	{
		System.out.println("skipping this test as it is not complete");
	}
    @Test
	public void skipTest2() 
	{
		System.out.println("skipping this test forcefully");
		throw new SkipException("skipping this test");
	}
    @Test
	public void skipTest3()
	{
		
		System.out.println("skipping this test based on condition");
		if(datasetup == true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
	}

}
