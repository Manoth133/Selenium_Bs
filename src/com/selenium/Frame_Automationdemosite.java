package com.selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Frame_Automationdemosite {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(4000);
		
		WebElement fe1 = driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']"));
		String t1 = fe1.getText();
		System.out.println(t1);
		
		List<WebElement> f1 = driver.findElements(By.tagName("iframe"));
		int size = f1.size();
		System.out.println(size);
		
		driver.switchTo().frame("singleframe");
		
		WebElement tex = driver.findElement(By.xpath("//input[@type='text']"));
		tex.sendKeys("manoth's single frame");
		String a1 = tex.getAttribute("value");
		System.out.println(a1);
		
		driver.switchTo().defaultContent();
		
		WebElement fe2 = driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));
		fe2.click();
		String t2 = fe2.getText();
		System.out.println(t2);
	
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		
	    WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(inner);
	    
	    WebElement fe3 = driver.findElement(By.xpath("//input[@type='text']"));
	    fe3.sendKeys("manoth's nested frame");
	    String a2 = fe3.getAttribute("value");
	    System.out.println(a2);
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
	    Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\autoframe1.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
	    

	}

}
