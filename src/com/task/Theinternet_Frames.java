package com.task;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Theinternet_Frames {

	public static void main(String[] args) throws Throwable {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/frames");
		String t1 = driver.getTitle();
		System.out.println(t1);
		Thread.sleep(4000);
		
		WebElement nf = driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']"));
		String t2 = nf.getText();
		System.out.println(t2);
		nf.click();
		
		List<WebElement> f = driver.findElements(By.tagName("frameset"));
		int size = f.size();
		System.out.println(size);
		
		WebElement ft = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(ft);
		
		Thread.sleep(4000);
		
		WebElement fl = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(fl);
		WebElement gt1 = driver.findElement(By.xpath("/html[1]/body[1]"));
		String t3 = gt1.getText();
		System.out.println(t3);
		
		driver.switchTo().parentFrame();

		WebElement f2 = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(f2);
		WebElement gt2 = driver.findElement(By.xpath("/html[1]/body[1]"));
		String t4 = gt2.getText();
		System.out.println(t4);
		
		driver.switchTo().parentFrame();
		
		WebElement f3 = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(f3);
		WebElement gt3 = driver.findElement(By.xpath("/html[1]/body[1]"));
		String t5 = gt3.getText();
		System.out.println(t5);
		
		driver.switchTo().defaultContent();
		
		WebElement f4 = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(f4);
		WebElement gt4 = driver.findElement(By.xpath("/html[1]/body[1]"));
		String t6 = gt4.getText();
		System.out.println(t6);
		
		driver.navigate().to("https://the-internet.herokuapp.com/frames");
		
		WebElement frame2 = driver.findElement(By.xpath("//a[normalize-space()='iFrame']"));
		String t7 = frame2.getText();
		System.out.println(t7);
		frame2.click();
		
		WebElement f5= driver.findElement(By.xpath("(//iframe[@id='mce_0_ifr'])[1]"));
		driver.switchTo().frame(f5);
		WebElement gt5 = driver.findElement(By.xpath("(//p[normalize-space()='Your content goes here.'])[1]"));
		gt5.sendKeys("this is a manoth's frame");
		String a1 = gt5.getText();
		System.out.println(a1);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\theinternetframe1.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
