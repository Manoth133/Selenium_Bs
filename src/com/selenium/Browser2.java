package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.youtube.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().back();
		
		driver.navigate().to("https://twitter.com/?lang=en");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		driver.close();
		
		
		
		
	}

}
