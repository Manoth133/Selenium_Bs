package com.task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Youtube {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		

		WebElement fe1 = driver.findElement(By.partialLinkText("m in 12 Hours | Selenium Tuto"));
		String t2 = fe1.getText();
		System.out.println(t2);
		fe1.click();
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\youtube.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
			
			WebElement fe2 = driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-primary-info-renderer'][contains(text(),'Selenium Full Course - Learn Selenium in 12 Hours ')]"));
			String t3 = fe2.getText();
			System.out.println(t3);
			
}
}
