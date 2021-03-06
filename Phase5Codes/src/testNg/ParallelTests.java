package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTests {

	WebDriver driver;
	WebDriver Edriver;
	
	@Test(groups="Chrome")
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Full Stack Java developer\\Hibernate Jars\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(groups="Chrome" , dependsOnMethods="LaunchChrome")
	public void Facebook() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
	}
	
	@Test(groups="Edge")
	public void LaunchEdge() {
		System.setProperty("webdriver.edge.driver", "D:\\Full Stack Java developer\\Hibernate Jars\\libs\\msedgedriver.exe");
		Edriver = new EdgeDriver();
		
		Edriver.get("https://en-gb.facebook.com/");
		
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(groups="Edge", dependsOnMethods="LaunchEdge")
	public void Facebook2() {
		System.out.println(Thread.currentThread().getId());
		Edriver.findElement(By.id("email")).sendKeys("pqr@gmail.com");
		Edriver.findElement(By.id("pass")).sendKeys("12345");
		Edriver.findElement(By.name("login")).click();
	}
	
	
}



