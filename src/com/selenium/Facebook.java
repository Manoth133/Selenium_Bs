package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		String at = username.getAttribute("placeholder");
		System.out.println(at);
		username.sendKeys("mano@gmail.com");
		String a = username.getAttribute("value");
		System.out.println(a);
		username.clear();
		boolean d = username.isDisplayed();
		System.out.println(d);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("M@noth");
		boolean e = password.isEnabled();
		System.out.println(e);
		
		WebElement btnlgn = driver.findElement(By.name("login"));
		btnlgn.click();
	}
}







