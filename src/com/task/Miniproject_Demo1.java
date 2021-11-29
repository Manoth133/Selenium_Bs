package com.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_Demo1 {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		// get commands
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		
		//find element methods and locators
		
		WebElement signin = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		signin.click();
		//boolean s1 = signin.isSelected();
		//System.out.println("sign-in clicked is ---"+s1);
		
		WebElement t2 = driver.findElement(By.xpath("//h3[normalize-space()='Create an account']"));
		String t3 = t2.getText();
		System.out.println(t3);
		
		WebElement ec = driver.findElement(By.id("email_create"));
		ec.sendKeys("manothkumar@gmail.com");
		String a1 = ec.getAttribute("value");
		System.out.println(a1);
		
		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
		
		Thread.sleep(4000);
		
		WebElement ypi = driver.findElement(By.xpath("//h3[normalize-space()='Your personal information']"));
		String t4 = ypi.getText();
		System.out.println(t4);
		
		WebElement tit = driver.findElement(By.xpath("//label[normalize-space()='Title']"));
		String t5 = tit.getText();
		System.out.println(t5);
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		findElement.click();
		boolean s1 = findElement.isSelected();
		System.out.println(s1);
		
		WebElement fnn = driver.findElement(By.xpath("//label[@for='customer_firstname']"));
		String t6 = fnn.getText();
		System.out.println(t6);
		
		WebElement fn = driver.findElement(By.id("customer_firstname"));
		fn.sendKeys("manoth");
		String a2 = fn.getAttribute("value");
		System.out.println(a2);
		
		WebElement lnn = driver.findElement(By.xpath("//label[@for='customer_lastname']"));
		String t7 = lnn.getText();
		System.out.println(t7);
		
		WebElement ln = driver.findElement(By.name("customer_lastname"));
		ln.sendKeys("kumar");
		String a3 = ln.getAttribute("value");
		System.out.println(a3);
		
	WebElement em = driver.findElement(By.xpath("//label[@for='email']"));
	String t8 = em.getText();
	System.out.println(t8);
	
	//WebElement em1 = driver.findElement(By.id("email"));
	//em1.sendKeys("manothkumar@gmail.com");
	//String a4 = ec.getAttribute("value");
	//System.out.println(a4);
	
	WebElement pass = driver.findElement(By.xpath("//label[@for='passwd']"));
	String t9 = pass.getText();
	System.out.println(t9);
	
	WebElement pass1 = driver.findElement(By.id("passwd"));
	pass1.sendKeys("M@noth678");
	String a5 = pass1.getAttribute("value");
	System.out.println(a5);
	
	Thread.sleep(4000);
	
	// single drop down process
	
	WebElement days = driver.findElement(By.id("days"));
	Select s2 = new Select(days);
	s2.selectByValue("10");
	
	WebElement months = driver.findElement(By.id("months"));
	Select s3 = new Select(months);
	s3.selectByValue("1");
	
	WebElement years = driver.findElement(By.id("years"));
	Select s4 = new Select(years);
	s4.selectByValue("1996");
	
	WebElement findElement2 = driver.findElement(By.xpath("//h3[normalize-space()='Your address']"));
	String t10 = findElement2.getText();
	System.out.println(t10);
	
	WebElement fn1 = driver.findElement(By.xpath("(//input[@id='firstname'])[1]"));
	String v1 = fn1.getAttribute("value");
	System.out.println(v1);
	
	WebElement ln2 = driver.findElement(By.xpath("(//input[@id='lastname'])[1]"));
	String v2 = ln2.getAttribute("value");
	System.out.println(v2);
	
	WebElement comp = driver.findElement(By.id("company"));
	comp.sendKeys("manoth .pvt.ltd");
	String a6 = comp.getAttribute("value");
	System.out.println(a6);
	
	WebElement add = driver.findElement(By.xpath("(//input[@id='address1'])[1]"));
	add.sendKeys("door 100/2 , j d road , barugur");
	String a7 = add.getAttribute("value");
	System.out.println(a7);
	
	WebElement add2 = driver.findElement(By.xpath("(//input[@id='address2'])[1]"));
	add2.sendKeys("doono124/8,barugur, P.O.");
	String a8 = add2.getAttribute("value");
	System.out.println(a8);
	
	WebElement city = driver.findElement(By.id("city"));
	city.sendKeys("krishnagiri");
	String a9 = city.getAttribute("value");
	System.out.println(a9);
	
	WebElement state = driver.findElement(By.id("id_state"));
	Select s5 = new Select(state);
	s5.selectByValue("5");
	
	WebElement pc = driver.findElement(By.id("postcode"));
	pc.sendKeys("64489");
	String a10 = pc.getAttribute("value");
	System.out.println(a10);
	
	WebElement country = driver.findElement(By.id("id_country"));
	Select s6 = new Select(country);
	s6.selectByValue("21");
	
	WebElement other = driver.findElement(By.id("other"));
	other.sendKeys("krishnagiri,chennai ,102/87");
	String a11 = other.getAttribute("value");
	System.out.println(a11);
	
	WebElement hp = driver.findElement(By.xpath("//input[@id='phone']"));
	hp.sendKeys("8773109575");
	String a12 = hp.getAttribute("value");
	System.out.println(a12);
	
	WebElement pm = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
	pm.sendKeys("9488052948");
	String a13 = pm.getAttribute("value");
	System.out.println(a13);
	
	
	WebElement al = driver.findElement(By.id("alias"));
	al.sendKeys("barugut-tk");
	String a14 = al.getAttribute("value");
	System.out.println(a14);
	
	WebElement reg = driver.findElement(By.xpath("(//span[normalize-space()='Register'])[1]"));
	reg.click();
	
	Thread.sleep(4000);
	 TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\miniproject.png");
		
		//FileUtils.copyFile(s,d );
		
		FileHandler.copy(s, d);
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
		
		
		
		
		

	}

}
