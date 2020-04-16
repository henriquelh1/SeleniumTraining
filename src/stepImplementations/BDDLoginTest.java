package stepImplementations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDLoginTest {
	
	WebDriver driver;
//	Given user is on the login page
	@Given("^user is on the login page$")
public void user_is_on_the_login_page() {
	System.out.println("User on the page");
	driver = utilities.DriverFactory.open("chrome");
	//URL
	driver.get("http://automationpractice.com/index.php?");
	
	// enter email
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
}
	
  @When ("^user enters correct username and correct password$")
	public void user_enters_correct_username_and_correct_password() {
		System.out.println("user enters username and password");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("luis@hahaha.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
	}
  
  @When("^user enters email (.*)$")
  public void user_enter_username(String username) {
	  System.out.println("Testing"+username);
	  driver.findElement(By.className("login")).click();
	  driver.findElement(By.id("email")).sendKeys(username);
	 
  }
  @And("^user enters password (.*)$")
  public void user_enters_password(String password) {
	  
	  driver.findElement(By.id("passwd")).sendKeys(password);
	  driver.findElement(By.id("SubmitLogin")).click();
  }
  
	@Then ("^user gets confirmation$")
  	public void user_gets_confirmation(){
		System.out.println("user gets confirmation");
  	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
