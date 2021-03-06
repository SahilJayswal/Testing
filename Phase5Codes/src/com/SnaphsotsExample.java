package com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnaphsotsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Full Stack Java developer\\Hibernate Jars\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scr, new File("D:\\Full Stack Java developer\\screenshot.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
