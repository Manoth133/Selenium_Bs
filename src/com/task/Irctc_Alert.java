package com.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Irctc_Alert {

	public static void main(String[] args) throws Throwable {
	
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.irctc.co.in/nget/train-search");
					Thread.sleep(3000);
					
		 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			//Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		 
		 Thread.sleep(3000);

		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\IRCTCAlert.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
		
					
		 
					

	}

}
