package com.task;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement elec  = driver.findElement(By.xpath("//span[text()='Electronics']"));
		a.moveToElement(elec).build().perform();
		driver.findElement(By.xpath("//span[text()='DTH Services']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		WebElement dish = driver.findElement(By.xpath("//img[@title='TATA Sky HD TATASKY HD Set Top Box 1 Month Hindi Lite Pack with 1 month Subscription Free']"));
		a.moveToElement(dish).build().perform();
		driver.findElement(By.xpath("(//div[contains(@class,'center quick-view-bar')])[2]")).click();
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\dthquickview.png");
			
			FileHandler.copy(s, d);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@class,'btn btn-theme-secondary')])[1]")).click();
			
			WebElement producttitle = driver.findElement(By.xpath("//h1[@itemprop='name']"));
			String t2 = producttitle.getText();
			System.out.println("producttitle :"+ t2);
			WebElement price = driver.findElement(By.xpath("//span[text()='1699']"));
			String t3 = price.getText();
			System.out.println("productprice :"+ t3);
			driver.findElement(By.xpath("//span[text()='add to cart']")).click();
			Thread.sleep(2000);
			WebElement sym = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-menu']"));
			a.moveToElement(sym).build().perform();
			Thread.sleep(2000);
			WebElement mf = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div/div[2]/ul/li[7]/a/span"));
			a.moveToElement(mf).build().perform();
			mf.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='Jackets']")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//label[@for='Color_s-Blue']")).click();
			Thread.sleep(4000);
			//WebElement dbc = driver.findElement(By.xpath("//img[@title='Urbano Fashion Blue Denim Jacket']"));
			JavascriptExecutor js1 =(JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,300)");
			WebElement dbc = driver.findElement(By.xpath("//img[@title='The Million Club Navy Casual Jacket']"));
			a.moveToElement(dbc).build().perform();
			a.click().perform();
		
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//div[@class='clearfix row-disc']//div)[2]")).click();
			//driver.findElement(By.xpath("(//a[contains(@class,'btn btn-theme-secondary')])[1]")).click();
			Set<String> aa = driver.getWindowHandles();
			for (String v : aa) {
				if (driver.switchTo().window(v).getTitle().contains("jacket")) {
					driver.switchTo().window(v);
				}	
			}
				Thread.sleep(2000);
				WebElement bule = driver.findElement(By.xpath("//h1[@title='The Million Club Navy Casual Jacket']"));
				String tb = bule.getText();
				System.out.println("productname for jacket:"+ tb);
				WebElement buleprice = driver.findElement(By.xpath("//span[text()='1049']"));
				String tbp = buleprice.getText();
				System.out.println("product price for jacket :"+ tbp);
				driver.findElement(By.xpath("//div[text()='XL']")).click();
				Thread.sleep(4000);
				 TakesScreenshot ta = (TakesScreenshot) driver;
					
					File sa = ta.getScreenshotAs(OutputType.FILE);
					
					File da = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\bluejacket.png");
					
					FileHandler.copy(sa, da);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='add to cart']")).click();
				driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-cart-icon-white-2']")).click();
				
				Thread.sleep(4000);
				 TakesScreenshot ta1 = (TakesScreenshot) driver;
					
					File sa1 = ta1.getScreenshotAs(OutputType.FILE);
					
					File da1 = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\totalsanpdeal.png");
					
					FileHandler.copy(sa1, da1);
				
				
				
				
				
				
			
			
			
			
			
			
		

	}

}
