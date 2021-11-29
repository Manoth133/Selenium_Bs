package com.task;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Miniproject7 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions a = new Actions(driver);
		WebElement ele  = driver.findElement(By.xpath("//div[text()='Electronics']"));
		a.moveToElement(ele).build().perform();
		WebElement ca = driver.findElement(By.linkText("Cameras & Accessories"));
		a.moveToElement(ca).perform();
		driver.findElement(By.linkText("Sports & action")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='_1AtVbE col-12-12'])[2]")).click();
		Set<String> aa = driver.getWindowHandles();
		for (String v : aa) {
			if (driver.switchTo().window(v).getTitle().contains("insta360")) {
				driver.switchTo().window(v);
			}	
		}
		Thread.sleep(4000);
		String insta = driver.findElement(By.xpath("//span[text()='Insta360 One R Twin Edition Sports and Action Camera']")).getText();
		System.out.println("productname  :" + insta);
		String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println("productprice  :"+ price);
		String brand = driver.findElement(By.xpath("(//li[@class='_21lJbe'])[2]")).getText();
		System.out.println("productbrandname  :"+ brand);
		driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l _2U9uOA')])[1]")).click();
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\mini7.png");
			
			FileHandler.copy(s, d);
	}

}
