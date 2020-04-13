package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDT {
	WebDriver driver;
	@Test(dataProvider = "getData")
	public void loginTest(String name, String email, String password) {
		// System.out.println("New Record: "+name+ " " + email + " "+password);
		

		
		//URL
		driver.get("http://automationpractice.com/index.php?");
		
		// enter email
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
	String text =	driver.findElement(By.className("info-account")).getText();
		System.out.println("Text: "+text);
	
	//enter password
		
		// click login 
		
		// get confirmation
		
		// close the brwoser
		

	

	}
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@DataProvider
	public String[][] getData(){
		return utilities.Excel.get("C:\\Software\\original.xls");
	}
	
}
