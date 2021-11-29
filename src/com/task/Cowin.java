package com.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Cowin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		driver.get("https://www.cowin.gov.in/");
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(4000);
		
		WebElement dis = driver.findElement(By.xpath("//label[normalize-space()='By District']"));
		String t2 = dis.getText();
		System.out.println(t2);
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow-wrapper ng-tns-c81-193'])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Tamil Nadu'])[1]")).click();
		Thread.sleep(4000);
		
		WebElement city = driver.findElement(By.xpath("//label[normalize-space()='By PIN']"));
		String t3 = city.getText();
		System.out.println(t3);
		
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow-wrapper ng-tns-c81-195'])[1]")).click();
		WebElement city1 = driver.findElement(By.xpath("(//span[@class='mat-option-text'][normalize-space()='Chennai'])[1]"));
		String t4 = city1.getText();
		System.out.println(t4);
		city1.click();
		
		
		driver.findElement(By.xpath("(//button[normalize-space()='Search'])[1]")).click();
		
		WebElement fe3 = driver.findElement(By.xpath("(//p[@aria-label='Age'])[1]"));
		String t5 = fe3.getText();
		System.out.println(t5);
		
		WebElement fe4 = driver.findElement(By.xpath("(//label[normalize-space()='18 & Above'])[1]"));
		String t6 = fe4.getText();
		System.out.println(t6);
		fe4.click();
		
		WebElement fe5 = driver.findElement(By.xpath("(//p[@aria-label='Cost'])[1]"));
		String t7 = fe5.getText();
		System.out.println(t7);
		
		WebElement fe6 = driver.findElement(By.xpath("(//label[normalize-space()='Paid'])[1]"));
		String t8 = fe6.getText();
		System.out.println(t8);
		fe6.click();
		
		WebElement fe7 = driver.findElement(By.xpath("(//p[@aria-label='Vaccine'])[1]"));
		String t9 = fe7.getText();
		System.out.println(t9);
		
		WebElement fe8 = driver.findElement(By.xpath("(//label[normalize-space()='Sputnik V'])[1]"));
		String t10 = fe8.getText();
		System.out.println(t10);
		fe8.click();
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(4000);
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\cowin1.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
			
			
			WebElement fe9 = driver.findElement(By.xpath("//body/app-root[@class='ng-tns-c75-0']/div[@class='ng-tns-c75-0 lang-en mainContainer']/section[@class='web_homePage loadingHeight ng-tns-c75-0']/app-home[@class='ng-star-inserted']/div[@class='nearestCentersSection pb-5']/div[@class='container']/appointment-table/div/div[@class='page-wrapper']/div[@class='register-wrap']/div[@class='padding-0']/div/div[@class='padding-0 ng-star-inserted']/div/div[@class='register-box']/div/div/div/form[@class='ng-invalid ng-touched ng-dirty']/div/div/div[@class='mobile-hide']/div[@class='col-padding matlistingblock ng-star-inserted']/div[@class='center-box']/div[@class='mat-main-field center-main-field']/div/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
			String t11 = fe9.getText();
			System.out.println(t11);
			
			WebElement fe10 = driver.findElement(By.xpath("//div[@class='row-disp']//p[@class='center-name-text'][normalize-space()='Perungudi, Chennai, Tamil Nadu, 600096']"));
			String t12 = fe10.getText();
			System.out.println(t12);
			
			WebElement fe11 = driver.findElement(By.xpath("//div[@class='mat-main-field center-main-field']//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[1]//span[1]"));
			String t13 = fe11.getText();
			System.out.println(t13);
			
			WebElement fe12 = driver.findElement(By.xpath("//div[@class='mat-main-field center-main-field']//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[2]//span[1]"));
			String t14 = fe12.getText();
			System.out.println(t14);
			
			

	}

}
