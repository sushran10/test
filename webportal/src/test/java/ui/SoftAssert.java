package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SoftAssert {
@Test
	public void titleTest() throws InterruptedException
	{
	SoftAssert sa = new SoftAssert();
	
		String expectedtitle = "Electronics, sdfd  Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "Search";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("Verify title");
	
	sa.assertEquals(actualtitle, expectedtitle,"Title verification failed");
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verify text");
		sa.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Closing browser");
		driver.close();
	sa.assertAll();
	Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		
	}

	
}


	



	



