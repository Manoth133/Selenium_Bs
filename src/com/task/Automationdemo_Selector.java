package com.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Automationdemo_Selector {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.manage().window().maximize();
		
	 driver.findElement(By.xpath("(//a[normalize-space()='Serialize'])[1]")).click();
	 driver.findElement(By.xpath("(//b[contains(text(),'Sakinalium - Data Driven Testing')])[2]")).click();
	 WebElement fe1 = driver.findElement(By.xpath("(//span[@id='result'])[1]"));
	 String t1 = fe1.getText();
	 System.out.println(t1);
	 
	 Thread.sleep(4000);
	 
	  TakesScreenshot t = (TakesScreenshot) driver;
		
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\Autodemoselect.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);

	}

}
