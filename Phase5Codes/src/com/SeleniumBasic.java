package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.firefox.FirefoxDriver;
*/
public class SeleniumBasic {

	public static void main(String[] args) {
		
	/*	//Firefox driver
		System.setProperty("webdriver.gecko.driver", "D:\\Full Stack Java developer\\Hibernate Jars\\libs\\geckodriver.exe");
		WebDriver Fdriver = new FirefoxDriver();*/
		
		//Chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Full Stack Java developer\\Hibernate Jars\\libs\\chromedriver.exe");
		WebDriver Cdriver = new ChromeDriver();
		
		String baseUrl = "https://en-gb.facebook.com/";
		String expectedTitle = "Facebook ? log in or sign up";
		String actualTitle = "";
		String tagName = "";
		
		//Launch Chrome browser and openup the baseUrl above.
		Cdriver.get(baseUrl);
		actualTitle = Cdriver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		// Selenium Testing using Locators
		tagName = Cdriver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		System.out.println("2.)"+ Cdriver.findElement(By.name("email")).getTagName());
		
		// Selenium Testing using CSS Locators
		System.out.println("3.)"+ Cdriver.findElement(By.className("_6lux")).getTagName());
		System.out.println("4.)"+ Cdriver.findElement(By.cssSelector("input#email")).getTagName());
		System.out.println("5.)"+ Cdriver.findElement(By.cssSelector("input.inputtext")).getTagName());
		System.out.println("6.)"+ Cdriver.findElement(By.cssSelector("input[name=email]")).getTagName());
		
		//XPath
		System.out.println("7.)"+ Cdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).getTagName());
		
	}

}
