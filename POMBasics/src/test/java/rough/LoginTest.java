package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ZohoHomePage;

public class LoginTest extends Page {

	public LoginTest(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		ZohoHomePage zoho = new ZohoHomePage(driver);
		zoho.goToSignUp();
		
	//	driver.quit();

	}
}
