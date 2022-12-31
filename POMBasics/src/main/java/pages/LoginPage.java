package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void signInUsing(String loginType) {

		driver.findElement(By.cssSelector("span.fed_icon")).click();

	}

	public void forgotPassword() {
		driver.findElement(By.cssSelector("a[onclick='goToForgotPassword();']")).click();

	}
}
