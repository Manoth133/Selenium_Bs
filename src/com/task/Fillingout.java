package com.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fillingout {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/filling-out-forms/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement f1 = driver.findElement(By.xpath("(//input[@id='et_pb_contact_name_0'])[1]"));
		f1.sendKeys("mano");
		String v1 = f1.getAttribute("value");
		System.out.println(v1);
		
		WebElement m1 = driver.findElement(By.xpath("(//textarea[@id='et_pb_contact_message_0'])[1]"));
		m1.sendKeys("some where is it missing");
		String v2 = m1.getAttribute("value");
		System.out.println(v2);
		
		driver.findElement(By.xpath("(//button[@name='et_builder_submit_button'][normalize-space()='Submit'])[1]")).click();
		
		WebElement f2 = driver.findElement( By.xpath("//input[@id='et_pb_contact_name_1']"));
		f2.sendKeys("kumar");
		String v3 = f2.getAttribute("value");
		System.out.println(v3);
		
		WebElement m2 = driver.findElement(By.xpath("//textarea[@id='et_pb_contact_message_1']"));
		m2.sendKeys("get a screenshot and pls update my account");
		String v4 = m2.getAttribute("value");
		System.out.println(v4);
		
		WebElement sb = driver.findElement(By.xpath("//input[@name='et_pb_contact_captcha_1']"));
		sb.sendKeys("15");
		String v5 = sb.getAttribute("value");
		System.out.println(v5);
		
		driver.findElement(By.xpath("(//button[@name='et_builder_submit_button'][normalize-space()='Submit'])[2]")) . click();
		
TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\fo.png");
		
		//FileUtils.copyFile(s,d );
		
		FileHandler.copy(s, d);
	}

}
