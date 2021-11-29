package com.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_Facebook {
	
	public static void main(String[] args) throws IOException {
		
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
		boolean de = username.isDisplayed();
		System.out.println(de);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("M@noth");
		boolean e = password.isEnabled();
		System.out.println(e);
		
		WebElement btnlgn = driver.findElement(By.name("login"));
		btnlgn.click();
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\fb.png");
		
		//FileUtils.copyFile(s,d );
		
		FileHandler.copy(s, d);
		
		
	}

}
