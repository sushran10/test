package ui;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetUp;
public class Login extends CommonDataSetUp{
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("login to application");
	}
	
	@AfterTest
	public void logoutfromApplication()
	{
		System.out.println("logout from application");
	}
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	@AfterMethod
	public void disconnectToDB()
	{
		System.out.println("DB Disconnected");
	}
	
	@Test(priority=1,description="this is the login test")
	public void bTest() {
		System.out.println("Test1");
	}

	@Test(priority=2,description="this is the login test")
	public void aTest() {
		System.out.println("Test2");
	}
}
