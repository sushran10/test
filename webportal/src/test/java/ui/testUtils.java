package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.internal.BaseTestMethod;

public class testUtils extends BaseTestMethod {
	
	public void getScreenShot()  
	Date currentdate = new Date();
	String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
	TakesScreenshot driver;
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+screenshotfilename+".png"));
	
}
