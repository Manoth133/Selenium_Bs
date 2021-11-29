package com.task;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Handiling_Alert {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		
		Thread.sleep(4000);
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println("simple alert text--" + text);
		alt.accept();
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		Alert alt2 = driver.switchTo().alert();
		String text2 = alt2.getText();
		System.out.println("conform alert text----"+ text2 );
		alt2.dismiss();
		String t1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(t1);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
		Alert alt3 = driver.switchTo().alert();
		alt3.sendKeys("manoth");
		System.out.println(alt3.getText());
		alt3.accept();
		String text3 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(text3);
		
		Thread.sleep(4000);
		
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\Alert.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
		
		
	}
}
