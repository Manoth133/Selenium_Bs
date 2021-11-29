package com.task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Amazon_Rightclick {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		WebElement mob = driver.findElement(By.xpath("(//a[normalize-space()='Mobiles'])[1]"));
		a.moveToElement(mob).build().perform();
		a.contextClick().build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		
		WebElement elec = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
		a.moveToElement(elec).build().perform();
		a.contextClick().build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement fash = driver.findElement(By.xpath("//a[normalize-space()='Fashion']"));
		a.moveToElement(fash).build().perform();
		a.contextClick().build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
				
     TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\Amazon.png");
		
		//FileUtils.copyFile(s,d );
		
		FileHandler.copy(s, d);
	}

}
