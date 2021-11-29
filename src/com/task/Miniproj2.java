package com.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Miniproj2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("manothkumar@gmail.com");
		
		WebElement passwrd = driver.findElement(By.name("passwd"));
		passwrd.sendKeys("M@noth678");
		
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
		Actions a = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		a.moveToElement(women).perform();
		WebElement dress = driver.findElement(By.xpath("//a[text()='Evening Dresses']"));
		dress.click();
		System.out.println(driver.getTitle());
		
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,600)", "");
		
		driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.className("icon-plus")).click();
		}		
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByValue("2");
		
		driver.findElement(By.id("color_24")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(10000);
		
		driver.switchTo().defaultContent();
		TakesScreenshot t = (TakesScreenshot) driver;
		File ac = t.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\mini2.png");
		FileHandler.copy(ac, b);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'confirm my')]")).click();
		Thread.sleep(2000);
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File d = t.getScreenshotAs(OutputType.FILE);
		File e = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\mini3.png");
		FileHandler.copy(d, e);
		

	}

}
