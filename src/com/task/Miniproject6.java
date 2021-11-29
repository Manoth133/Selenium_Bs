package com.task;

import java.awt.Desktop.Action;
import java.io.File;
import java.util.List;
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
import org.openqa.selenium.support.ui.Select;

public class Miniproject6 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement accountandlist = driver.findElement(By.xpath("//span[text()[normalize-space()='Account & Lists']]"));
		a.moveToElement(accountandlist).build().perform();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9042427891");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("142103");
		driver.findElement(By.xpath("//span[@class='a-button-inner']//input[1]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop core i5");
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[7]//img")).click();
		Set<String> aa = driver.getWindowHandles();
		for (String v : aa) {
			if (driver.switchTo().window(v).getTitle().contains("Lenovo")) {
				driver.switchTo().window(v);
			}	
		}
		Thread.sleep(3000);
		 WebElement producttitle = driver.findElement(By.xpath("//h1[@id=\"title\"]"));
		 String t2 = producttitle.getText();
		System.out.println("producttitle  :"+ t2);
		 WebElement productprice = driver.findElement(By.xpath("//span[@id=\"priceblock_ourprice\"]"));
		 String t4 = productprice.getText();
		System.out.println("productprice  : "+t4);
		WebElement brand = driver.findElement(By.xpath("//div[@id='productOverview_feature_div']//tbody/tr[2]/td[2]/span"));
		String t3 = brand.getText();
		System.out.println("brand name  :"+ t3);
		WebElement qa = driver.findElement(By.xpath("(//select[@id='quantity'])[1]"));
		qa.click();
		Select s1 = new Select(qa);
		s1.selectByValue("3");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")).click();
		
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\mini5.png");
			
			FileHandler.copy(s, d);
		
		}
}
		
		
		
		
		
		

	


