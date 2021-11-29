package com.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Toolsqa_Frame {

	public static void main(String[] args) throws Throwable {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		driver.switchTo().frame("frame1");
		
		WebElement fe1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String t2 = fe1.getText();
		System.out.println(t2);
		driver.switchTo().defaultContent();
		
        driver.switchTo().frame("frame2");
		
		WebElement fe2 = driver.findElement(By.id("sampleHeading"));
		String t3 = fe2.getText();
		System.out.println(t3);
		
		driver.switchTo().defaultContent();
		
		
		driver.navigate().to("https://demoqa.com/nestedframes");
		String t7 = driver.getTitle();
		System.out.println(t7);
		
		Thread.sleep(4000);
		
		WebElement nf1 = driver.findElement(By.xpath("//span[normalize-space()='Nested Frames']"));
		String t4 = nf1.getText();
		System.out.println(t4);
		
		driver.switchTo().frame("frame1");
		
		WebElement pn = driver.findElement(By.xpath("(//body)[1]"));
		String t5 = pn.getText();
		System.out.println(t5);
		
		WebElement cf = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(cf);
		
		WebElement fe3 = driver.findElement(By.xpath("//p[normalize-space()='Child Iframe']"));
		String t6 = fe3.getText();
		System.out.println(t6);
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\toolsqaframe2.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
	    
		
		
		
		
		
		
		

	}

}
