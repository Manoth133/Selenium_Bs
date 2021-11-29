package com.task;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo_Guru {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.manage().window().maximize();
		

		WebElement head = driver.findElement(By.xpath("(//td[@class='heading3'])[1]"));
		String t1 = head.getText();
		System.out.println(t1);
		
		WebElement cus = driver.findElement(By.xpath("(//td[normalize-space()='Customer ID'])[1]"));
		String t2 = cus.getText();
		System.out.println(t2);
		
		WebElement cus1 = driver.findElement(By.name("cusid"));
		cus1.sendKeys("123456987");
		String a1 = cus1.getAttribute("value");
		System.out.println(a1);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println("simple alert text--" + text);
	    alt.accept();
	    
	    System.out.println("Customer Successfully Delete!");
		
		
		
		
	}

}
