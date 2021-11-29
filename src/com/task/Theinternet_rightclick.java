package com.task;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Theinternet_rightclick {
	
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
Thread.sleep(4000);
		
		Actions a = new Actions(driver);
		WebElement hs = driver.findElement(By.id("hot-spot"));
		a.moveToElement(hs).build().perform();
		a.contextClick().build().perform();
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println("simple alert text--" + text);
	    alt.accept();
		
	    Thread.sleep(5000);
		
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\theinternetrc.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
	}

}
