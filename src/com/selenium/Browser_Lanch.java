package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Lanch {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	

	
	
	
	
	
	
	
	}

}
