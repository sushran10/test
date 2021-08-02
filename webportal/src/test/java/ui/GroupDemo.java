package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetUp;

@Test(groups="user-registration")

public class GroupDemo extends CommonDataSetUp {

	@Test(priority = 1,groups="regression")
	public void aTest() {
		System.out.println("Test1");
	}

	@Test(priority = 2,groups="regression")
	public void bTest() {
		System.out.println("Test2");
	}

	@Test(priority =3,groups={"regression","bvt"})
	public void cTest() {
		System.out.println("Test3");
	}

	@Test(groups="bvt")
		public void dTest() {
			System.out.println("Test4");
}
}