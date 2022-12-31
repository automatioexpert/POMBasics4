package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPage {

	public WebDriver driver;

	public PricingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getHeader() {
		driver.findElement(By.cssSelector("h1.field-price-heading")).getText();
	}

}
