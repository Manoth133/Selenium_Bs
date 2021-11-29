package com.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Automation_Demosite {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement fn = driver.findElement(By.id("firstName"));
		String at = fn.getAttribute("placeholder");
		System.out.println(at);
		fn.sendKeys("manoth");
		String a1 = fn.getAttribute("value");
		System.out.println(a1);
		boolean d1 = fn.isDisplayed();
		System.out.println(d1);
		
		WebElement ln = driver.findElement(By.id("lastName"));
		String atln = ln.getAttribute("placeholder");
		System.out.println(atln);
		ln.sendKeys("kumar");
		String a2 = ln.getAttribute("value");
		System.out.println(a2);
		boolean d2 = ln.isDisplayed();
		System.out.println(d2);
		
		
		WebElement ue = driver.findElement(By.id("userEmail"));
		String atue = ue.getAttribute("placeholder");
		System.out.println(atue);
		ue.sendKeys("mano2@gmail.com");
		String a3 = ue.getAttribute("value");
		System.out.println(a3);
		boolean d3 = ue.isDisplayed();
		System.out.println(d3);
		
		
		
		
		WebElement un = driver.findElement(By.id("userNumber"));
		String atun = un.getAttribute("placeholder");
		System.out.println(atun);
		un.sendKeys("8940849746");
		String a5 = un.getAttribute("value");
		System.out.println(a5);
		boolean d5 = un.isDisplayed();
		System.out.println(d5);
		
		
		
		
		
		
		

}
}
