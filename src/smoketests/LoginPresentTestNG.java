package smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginPresentTestNG {
	
	WebDriver driver;
	
	@Test
	public void loginElementsPresentTest() {		
		
		boolean loginEmailText =  driver.findElement(By.id("email")).isDisplayed();
		boolean passwordBox = driver.findElement(By.id("passwd")).isDisplayed();
		Assert.assertTrue(loginEmailText);
		Assert.assertTrue(passwordBox);
	}
	@BeforeMethod
	public void setUp() {
		System.out.println("Starting test");
		driver = utilities.DriverFactory.open("chrome");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing test");
	}
}
