package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMPage {

	WebDriver driver;

	public CRMPage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToPricing() {
		driver.findElement(By.cssSelector("li.leaf.zmenu-pricing.selected>a[href*='pricing']")).click();
	}

	public void goToCustomers() {

		WebElement customers = driver.findElement(By.xpath("(//span[contains(text(),'Customers')])[2]"));

		customers.click();

	}

}
