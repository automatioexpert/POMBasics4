package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoHomePage {
	WebDriver driver;
	
	public ZohoHomePage(WebDriver driver) {
		this.driver=driver;
	}

	public void goToSignUp() {

		driver.findElement(By.cssSelector("a.zh-signup")).click();

	}

	public void goToSignIn() {

		driver.findElement(By.cssSelector("a.zh-login")).click();
	}

	public void goToCustomers() {
		driver.findElement(By.cssSelector("a.zh-customers")).click();
	}

	public void goToSupport() {
		driver.findElement(By.cssSelector("a.zh-support")).click();

	}

}
