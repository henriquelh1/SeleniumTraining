package smoketests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagTest {

  WebDriver driver;
	
	@Test
	public void loginElementsPresentTest() {		
		
		List <WebElement> aElements = driver.findElements(By.tagName("a"));
		for (WebElement aElement : aElements) {
			System.out.println(aElement.getText());
		}
		
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
