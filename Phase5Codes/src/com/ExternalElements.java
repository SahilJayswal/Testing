package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Full Stack Java developer\\Hibernate Jars\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.dev");
		System.out.println("Current URL : "+ driver.getCurrentUrl());
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		driver.navigate().to("https://en-gb.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		driver.navigate().forward();
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
