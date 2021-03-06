package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	SoftAssert soft = new SoftAssert();
	WebDriver driver;
	
	
	@Test
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Full Stack Java developer\\Hibernate Jars\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="Launch")
	public void Facebook() {
		driver.get("https://en-gb.facebook.com/");
		soft.assertEquals("Facebook ? log in or sign up", driver.getTitle());		
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="Facebook")
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		soft.assertAll();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
