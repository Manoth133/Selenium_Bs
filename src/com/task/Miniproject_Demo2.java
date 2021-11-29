package com.task;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_Demo2 {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		// get commands
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//h3[normalize-space()='Selenium Ruby']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='View Basket']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();

		
		WebElement bd = driver.findElement(By.xpath("(//h3[normalize-space()='Billing Details'])[1]"));
		String t1 = bd.getText();
		System.out.println(t1);
		
		WebElement fn = driver.findElement(By.xpath("//label[@for='billing_first_name']"));
		String t2 = fn.getText();
		System.out.println(t2);
		WebElement fn1 = driver.findElement(By.id("billing_first_name"));
		fn1.sendKeys("manoth");
		String a1 = fn1.getAttribute("value");
		System.out.println(a1);
		
		WebElement ln = driver.findElement(By.xpath("//label[@for='billing_last_name']"));
		String t3 = ln.getText();
		System.out.println(t3);
		WebElement ln1 = driver.findElement(By.id("billing_last_name"));
		ln1.sendKeys("kumar");
		String a2 = ln1.getAttribute("value");
		System.out.println(a2);
		
		WebElement cpn = driver.findElement(By.xpath("//label[normalize-space()='Company Name']"));
		String t4 = cpn.getText();
		System.out.println(t4);
		WebElement cpn1 = driver.findElement(By.id("billing_company"));
		cpn1.sendKeys("manothkumar company");
		String a3= cpn1.getAttribute("value");
		System.out.println(a3);
		
		WebElement bm = driver.findElement(By.xpath("//label[@for='billing_email']"));
		String t5 = bm.getText();
		System.out.println(t5);
		WebElement bm1 = driver.findElement(By.id("billing_email"));
		bm1.sendKeys("manoth@gmail.com");
		String a4= bm1.getAttribute("value");
		System.out.println(a4);
		
		WebElement bp = driver.findElement(By.xpath("//label[@for='billing_phone']"));
		String t6 = bp.getText();
		System.out.println(t6);
		WebElement bp1 = driver.findElement(By.id("billing_phone"));
		bp1.sendKeys("8940849754");
		String a5= bp1.getAttribute("value");
		System.out.println(a5);
		
		WebElement bc = driver.findElement(By.xpath("//label[@for='billing_country']"));
		String t7 = bc.getText();
		System.out.println(t7);
		WebElement bc1 = driver.findElement(By.id("billing_country"));
		Select s1 = new Select(bc1);
		s1.selectByValue("IN");
		
		WebElement ad = driver.findElement(By.xpath("//label[@for='billing_address_1']"));
		String t8 = ad.getText();
		System.out.println(t8);
		WebElement ad1 = driver.findElement(By.xpath("(//input[@id='billing_address_1'])[1]"));
		ad1.sendKeys("door no - 100/2, j d road");
		String a6= ad1.getAttribute("value");
		System.out.println(a6);
		WebElement ad2 = driver.findElement(By.xpath("(//input[@id='billing_address_2'])[1]"));
		ad2.sendKeys("k s govindacheety , barugur");
		String a7= ad2.getAttribute("value");
		System.out.println(a7);
		
		WebElement bcc = driver.findElement(By.xpath("(//label[@for='billing_city'])[1]"));
		String t9 = bcc.getText();
		System.out.println(t9);
		WebElement bcc1 = driver.findElement(By.id("billing_city"));
		bcc1.sendKeys("barugur");
		String a8= bcc1.getAttribute("value");
		System.out.println(a8);
		
		Thread.sleep(3000);
		
		WebElement bs = driver.findElement(By.xpath("//label[@for='billing_state']"));
		String t10 = bs.getText();
		System.out.println(t10);
		
		
		 
		WebElement bss1= driver.findElement(By.xpath("(//b[@role='presentation'])[2]"));
		bss1.click();
		WebElement bss2= driver.findElement(By.xpath("(//input[@aria-expanded='true'])[2]"));
		bss2.sendKeys("Tamil Nadu");
		WebElement bss3= driver.findElement(By.xpath("//div[@role='option']"));
		bss3.click();
		
		
		WebElement bpc = driver.findElement(By.xpath("(//label[@for='billing_postcode'])[1]"));
		String t11 = bpc.getText();
		System.out.println(t11);
		WebElement bpc1 = driver.findElement(By.id("billing_postcode"));
		bpc1.sendKeys("602001");
		String a10= bpc1.getAttribute("value");
		System.out.println(a10);
		
		 driver.findElement(By.xpath("(//input[@id='createaccount'])[1]")).click();
		 
		 Thread.sleep(4000);
		 
		 WebElement apc = driver.findElement(By.xpath("//label[@for='account_password']"));
			String t12 = apc.getText();
			System.out.println(t12);
			WebElement apc1 = driver.findElement(By.id("account_password"));
			apc1.sendKeys("M@noth789manomoni");
			String a11= apc1.getAttribute("value");
			System.out.println(a11);
		
			 WebElement add = driver.findElement(By.xpath("(//h3[normalize-space()='Additional Information'])[1]"));
				String t13 = add.getText();
				System.out.println(t13);
				
				WebElement on= driver.findElement(By.xpath("(//label[normalize-space()='Order Notes'])[1]"));
				String t14 = on.getText();
				System.out.println(t14);
				WebElement oc1 = driver.findElement(By.id("order_comments"));
				oc1.sendKeys("fast delevery");
				String a12= oc1.getAttribute("value");
				System.out.println(a12);
				
				WebElement dob= driver.findElement(By.xpath("//label[normalize-space()='Direct Bank Transfer']"));
				String t15 = dob.getText();
				System.out.println(t15);
				
				 driver.findElement(By.xpath("//label[normalize-space()='Cash on Delivery']")).click();
				 driver.findElement(By.xpath("//input[@id='place_order']")).click();
		
		
		Thread.sleep(4000);
				 
				 TakesScreenshot t = (TakesScreenshot) driver;
					
					File s = t.getScreenshotAs(OutputType.FILE);
					
					File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\miniproject2.png");
					
					//FileUtils.copyFile(s,d );
					
					FileHandler.copy(s, d);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
