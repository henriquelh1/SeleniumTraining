package smoketests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageTitleJUnit {
	WebDriver driver;
	String webURL = "http://automationpractice.com/index.php";
	
	@Test
	public void pageTitleTest() {
		
		driver.get(webURL);
		driver.getTitle();
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Store";
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Before
	public void setUp() {
		System.out.println("Setting up test");
		driver = utilities.DriverFactory.open("chrome");
	}
	
	@After
	public void tearDown() {
		System.out.println("Closing Test");
		driver.quit();
	}
	
	
}
