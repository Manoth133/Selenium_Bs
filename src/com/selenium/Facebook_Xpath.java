package com.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Xpath {

	public static void main(String[] args) throws Throwable   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.id("email")) .sendKeys("mano@gmail.com");
		driver.findElement(By.id("pass")) . sendKeys("M@noth");
		//driver.findElement(By.name("login")) . click();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")) .click();
		Thread.sleep(4000);
		WebElement fn = driver.findElement( By.name("firstname"));
		fn.sendKeys("manoth");
		String a1 = fn.getAttribute("value");
		System.out.println(a1);
		WebElement ln = driver.findElement(By.name("lastname"));
        ln.sendKeys("kumar");
        String a2 = ln.getAttribute("value");
		System.out.println(a2);
        

        WebElement re = driver.findElement(By.name("reg_email__"));
        re.sendKeys("mano@gmail.com");
        String a3 = re.getAttribute("value");
		System.out.println(a3);
        
        WebElement rec = driver.findElement(By.name("reg_email_confirmation__"));
        rec.sendKeys("mano@gmail.com");
        String a4 = rec.getAttribute("value");
		System.out.println(a4);
        
        WebElement psi = driver.findElement(By.id("password_step_input"));
        psi.sendKeys("M@noth678");
        String a5 = psi.getAttribute("value");
		System.out.println(a5);
		
		WebElement day = driver.findElement(By.id("day"));
		Select dss = new Select(day);
		dss.selectByValue("10");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(3);
		WebElement text = driver.findElement(By.xpath("//option[normalize-space()='Apr']"));
		String text2 = text.getText();
		System.out.println("displayed month :"+ text2);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1995");
		   
        WebElement me = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        me.click();
        boolean se = me.isSelected();
		System.out.println(se);
        
        Thread.sleep(4000);
        
        driver.findElement(By.name("websubmit")) .click();
        
     TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\fbn.png");
		
		//FileUtils.copyFile(s,d );
		
		FileHandler.copy(s, d);
		
        
        
        
        
        
        
		
		
		
		
		
		
		

	}

}
