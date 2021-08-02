package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	@Test
	public void TitleTest() {
		

	String expectedtitle = "Electronics, Cars, rdfhg Fashion, Collectibles & More | eBay";
	String expectedtext = "Search";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("Verifying title");

		Assert.assertEquals(actualtitle, expectedtitle);
		String Actualtext = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verifying text");
		Assert.assertEquals(Actualtext, expectedtext, "Text verification fails");
		System.out.println("Closing browser title");
		driver.close();
		
	}

}
