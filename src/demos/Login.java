package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// Open Brower
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//URL
		driver.get("http://automationpractice.com/index.php?");
		
		// enter email
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("luis@hahaha.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
	String text =	driver.findElement(By.className("info-account")).getText();
		System.out.println("Text: "+text);
		
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	if (pageTitle == "My account - My Store") {
		System.out.println("Page title:"+pageTitle);
	}
	//enter password
		
		// click login 
		
		// get confirmation
		
		// close the brwoser
		

	}

}
