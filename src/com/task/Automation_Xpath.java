package com.task;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Automation_Xpath {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement text = driver.findElement(By.xpath("(//h1[normalize-space()='Automation Demo Site'])[1]"));
		String text2 = text.getText();
		System.out.println(text2);
		
		   Thread.sleep(4000);
		
	 WebElement fn = driver.findElement(By.xpath("//input[@placeholder='First Name']")) ;
	 fn. sendKeys("manoth");
	 String a1 = fn.getAttribute("value");
		System.out.println(a1);
	 

	 WebElement ln = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	ln.sendKeys("kumar");
	String a2= ln.getAttribute("value");
	System.out.println(a2);
	 
	 WebElement ad = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
	 ad.sendKeys("100/2, jd road, barugur");
	 String a3 = ad.getAttribute("value");
		System.out.println(a3);
		
	 WebElement em = driver.findElement(By.xpath("//input[@type='email']"));
	 em. sendKeys("mano@gmail.com");
	 String a4 = em.getAttribute("value");
		System.out.println(a4);
	 
	 WebElement ph = driver.findElement(By.xpath("//input[@type='tel']"));
	 ph. sendKeys("9488052948");
	 String a5 = ph.getAttribute("value");
		System.out.println(a5);
	 
	 WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
	male. click();
	  boolean se = male.isSelected();
			System.out.println(se);
	 driver.findElement(By.xpath("//label[normalize-space()='Male']")). click();
	 
	 driver.findElement(By.xpath("(//input[@id='checkbox1'])[1]")) .click();
	 driver.findElement(By.xpath("(//label[normalize-space()='Cricket'])[1]")) .click();
	 
	 driver.findElement(By.xpath("(//input[@id='checkbox2'])[1]")) .click();
	 driver.findElement(By.xpath("//label[normalize-space()='Movies']")) .click();
	 
	 driver.findElement(By.xpath("(//input[@id='checkbox3'])[1]")) .click();
	 driver.findElement(By.xpath("(//label[normalize-space()='Hockey'])[1]")) .click();
	 
	 //language selecting
	 WebElement lang = driver.findElement(By.id("msdd"));
	 lang.click();
	 driver.findElement(By.xpath("//section[@id='section']//li[1]")).click();
	 driver.findElement(By.xpath("//section[@id='section']//li[3]")).click();
	
	 
	 WebElement skill = driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
	 String text3 = skill.getText();
	 System.out.println(text3);
	 WebElement id = driver.findElement(By.id("Skills"));
	 Select s5 = new Select(id);
		s5.selectByValue("Android");
		
		
		//driver.findElement(By.xpath("(//option[normalize-space()='Select Country'])[1]")).click();
		
		
		 WebElement cou = driver.findElement(By.xpath("//label[normalize-space()='Select Country :']"));
		 String text4 = cou.getText();
		 System.out.println(text4);
		 WebElement cou1 = driver.findElement(By.id("country"));
		 Select s6 = new Select(cou1);
			s6.selectByValue("India");
			
			 WebElement yb = driver.findElement(By.id("yearbox"));
			 Select s7 = new Select(yb);
				s7.selectByValue("1996");
				
				 WebElement mon = driver.findElement(By.xpath("(//select[@placeholder='Month'])[1]"));
				 Select s8 = new Select(mon);
					s8.selectByValue("January");
					
					 WebElement db = driver.findElement(By.id("daybox"));
					 Select s9 = new Select(db);
						s9.selectByValue("10");
	 
	
	 
	 
	 WebElement fp = driver.findElement(By.id("firstpassword"));
	 fp.sendKeys("m@noth");
	 String a6 = fp.getAttribute("value");
		System.out.println(a6);
	 
	 WebElement sp = driver.findElement(By.id("secondpassword"));
	sp. sendKeys("m@noth");
	String a7 = sp.getAttribute("value");
	System.out.println(a7);
	 
	 driver.findElement(By.id("submitbtn")). click();
	 
	 Thread.sleep(4000);
	 TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\Auto.png");
		
		//FileUtils.copyFile(s,d );
		
		FileHandler.copy(s, d);
		
		
	 
	 
	 
	 
	 
	 

	}

}
