package ui;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class DataProviderMove {

	@Test(dataProvider = "create")
	public Object[][] dataSet1(Method m) {
		Object[][] testdata = null;

		if (m.getName().equals("test")) {
			testdata = new Object[][] 
					{ 
				{ "username", "password" }, 
				{ "username1", "password1" },
				{ "username2", "password2" }, 
				{ "username3", "password3" }};
		} 
		else if (m.getName().equals("test1"))
		{
			testdata = new Object[][] 
					{
				{ "username", "password", "third" }, 
				{ "username1", "password1", "third1" },
				{ "username2", "password2", "third2" }, 
				{ "username3", "password3", "third3" } };

		}

		return testdata;
	}
}
