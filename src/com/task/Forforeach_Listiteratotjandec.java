package com.task;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Forforeach_Listiteratotjandec {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")) .click();
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(3);
		
		//collection frist type used
		
		List<WebElement> options = s1.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		// for loop for 
		for (int i = 0; i < size; i++) {
			
			System.out.println(options.get(i).getText());
			
		}
		
		//for each loop using 
		
		for (WebElement foreach : options) {
			
			System.out.print(foreach.getText());
			
		}
		
		System.out.println(" ");
		
		// LIST ITERATOR
		
		ListIterator<WebElement> li = options.listIterator();
		// while loop using here
		// IT print in acesending order
		while (li.hasNext()) {
		System.out.print(li.next().getText());
			
		}
		
		System.out.println( "" );
		
		// it print in descending order
		
		while (li.hasPrevious()) {
			System.out.print(li.previous().getText());
			
		}
		
		System.out.println("****************************************************");
		
		// particular two values getting  value getting in a option like drop down box
		//dom structure example date , month, year etc
		
		// by using for loop and if-else
		
		
		for (int i = 0; i<size; i++) {
			
			if (i==0 || i==11) {
				
				System.out.println(options.get(i).getText());
				
			} else {
				
				System.out.println("");

			}
			
		}
		
		System.out.println("*******************************************");
		
		// particular single value getting in a option like drop down box
		
		// by using forloop and if- else 
		
for (int i = 0; i<size; i++) {
			
			if (i==2) {
				
				System.out.println("my bith date is " + options.get(i).getText());
				
			} else {
				
				System.out.println("");

			}
			
		}
		
		
		
		
		

	}

}
