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

public class Myntra {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiA4b2MBhD2ARIsAIrcB-TCwhVk6WUaM9dyHwuq13aldVU33IZ2mfO7l1AOUo8mRK_iyCgvszAaAqzOEALw_wcB");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement women  = driver.findElement(By.xpath("(//a[@class='desktop-main'])[2]"));
		a.moveToElement(women).build().perform();
		WebElement handbag  = driver.findElement(By.xpath("//a[@data-reactid='320']"));
		a.moveToElement(handbag).build().perform();
		handbag.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[normalize-space()='Women']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[8]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[20]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();
		Set<String> aa = driver.getWindowHandles();
		for (String v : aa) {
			if (driver.switchTo().window(v).getTitle().contains("lavie")) {
				driver.switchTo().window(v);
			}	
		}
		WebElement lavie = driver.findElement(By.xpath("//h1[text()='Lavie']"));
		String t2 = lavie.getText();
		System.out.println("brandname :"+t2);
		WebElement productname = driver.findElement(By.xpath("//h1[text()='Pink Saffiano Textured Handheld Bag']"));
		String t3 = productname.getText();
		System.out.println("productname :"+t3);
		WebElement price = driver.findElement(By.xpath("//span[@class='pdp-price']//strong[1]"));
		String t4 = price.getText();
		System.out.println("productprice :"+t4);
		WebElement dod = driver.findElement(By.xpath("//h4[text()='Delivery Options ']"));
		String t5 = dod.getText();
		System.out.println(t5);
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Enter a PIN code']"));
		pincode.sendKeys("635104");
		String a1 = pincode.getAttribute("value");
		System.out.println("pincode :"+a1);
		driver.findElement(By.className("Address-address-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-bag pdp-button')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[3]")).click();
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\myntra.png");
			
			FileHandler.copy(s, d);
		
		

	}

}
