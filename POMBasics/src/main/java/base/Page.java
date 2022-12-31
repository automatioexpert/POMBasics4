package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Page {
	public static WebDriver driver;
	public static TopMenu menu;


	public Page(WebDriver driver) {
		if(driver==null) {
			this.driver = driver;
			driver.get("https://zoho.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	

	}

	public static void quit() {
		
	}
	public static void verifyEquals(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	}

	// Common keywords:

	public void click(String locator) {
		if(locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector("")).click();
		}
		
		else if(locator.endsWith("_xpath")) {
			driver.findElement(By.cssSelector("")).click();
		}

	
	}

}
