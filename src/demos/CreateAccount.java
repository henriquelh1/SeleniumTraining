package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
		
	public static void main (String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//URL
		driver.get("http://automationpractice.com/index.php?");
		
		// enter email
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		
		
		driver.findElement(By.id("email_create")).sendKeys("luis@hah1.com");;
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Luis");
		driver.findElement(By.id("customer_lastname")).sendKeys("Silva");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
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
	
	
}
