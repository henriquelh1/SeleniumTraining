package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@RunWith (value = Parameterized.class)
public class NewAccountDDT {
	
	String name;
	String email;
	String phone;
	String gender;
	String password;
	String country;
	boolean weeklyEmail;
	boolean monthlyEmail;
	boolean occasionalEmail;
	WebDriver driver;
	
	
	@Test
	public void newAccountTest() {
		System.out.println("New Record: "+name+" " +email+ " " +phone + " "+ gender + " " + password + " "+country+ " " 
							+ weeklyEmail+ " " + monthlyEmail +" " + occasionalEmail);
			
			
			driver.findElement(By.className("login")).click();
			
			
			driver.findElement(By.id("email_create")).sendKeys(email);;
			driver.findElement(By.id("SubmitCreate")).click();
			
			driver.findElement(By.id("id_gender1")).click();
			driver.findElement(By.id("customer_firstname")).sendKeys(name);
			driver.findElement(By.id("customer_lastname")).sendKeys(name);
			driver.findElement(By.id("passwd")).sendKeys(password);
			
			new Select(driver.findElement(By.id("days"))).selectByValue("11");
			new Select(driver.findElement(By.id("months"))).selectByValue("1");
			new Select (driver.findElement(By.id("years"))).selectByValue("2010");
			driver.findElement(By.id("newsletter")).click();
			
			driver.findElement(By.id("address1")).sendKeys("Rua Steet");
			driver.findElement(By.id("city")).sendKeys("Manaus");
			new Select(driver.findElement(By.id("id_state"))).selectByValue("2");
			driver.findElement(By.id("postcode")).sendKeys("23456");
			driver.findElement(By.id("phone_mobile")).sendKeys("507987234");
			driver.findElement(By.id("alias")).sendKeys("HAHAHHAHA");
			System.out.println("asihishdish");
	}
	
	@Parameters
	public static List<String[]> getData(){
	return utilities.CSV.get("C:\\Software\\original.csv");
 }
	
	public NewAccountDDT(String name, String email, String phone, String gender, String password, String country,
			String weeklyEmail, String monthlyEmail, String occasionalEmail) {
		this.name=name;
		this.email=email;
		this.phone =phone;
		this.gender=gender;
		this.password=password;
		this.country=country;
		
		if(weeklyEmail.equals("TRUE")) {this.weeklyEmail =true;}
		else {this.weeklyEmail=false;}

		if(weeklyEmail.equals("TRUE")) {this.monthlyEmail =true;}
		else {this.monthlyEmail=false;}
		
		if(weeklyEmail.equals("TRUE")) {this.occasionalEmail =true;}
		else {this.occasionalEmail=false;}
	}
	@Before
	public void setUp() {

		driver =  utilities.DriverFactory.open("Chrome");
		
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@After
	public void tearDown() {
		driver.quit();
	}
 }
