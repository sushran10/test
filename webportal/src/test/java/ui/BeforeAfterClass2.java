package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetUp;


public class BeforeAfterClass2 extends CommonDataSetUp{

	

	@Test(priority = 1, groups = "regression")
	public void aTest() 
	{
		System.out.println("Test1");
	}

	@Test(priority = 2, groups = "regression")
	public void bTest() 
	{
		System.out.println("Test2");
	}

	@Test(groups = { "regression", "bvt" })
	public void cTest()
	{
		System.out.println("Test3");
	}

	@Test(groups = "bvt")
	public void dTest() 
	{
		System.out.println("Test4");
	}
}
