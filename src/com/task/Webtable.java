package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		driver.manage().window().maximize();
		String t1 = driver.getTitle();
		System.out.println(t1);
		String cu1 = driver.getCurrentUrl();
		System.out.println(cu1);
		
		//WebElement f = driver.findElement(By.tagName("tbody"));
		//System.out.println(f.getText());
		
		// To find numbers of rows
		
		List<WebElement> tr = driver.findElements(By.tagName("tr"));
		int row = tr.size();
		System.out.println( "the number of rows =" +row);//7
		
		// to find number of columns 
		
		List<WebElement> td = driver.findElements(By.tagName("td"));
		int cols = td.size();
		System.out.println("the number of columns=" +cols);//4
		
		// relase data for a JAVA
		
		
		 String s= "JAVA";
		
		for  (int r = 0; r <  row; r++) {
			
			if (r==5) {
				if (tr.get(r).getText().contains(s)) {
					System.out.println(tr.get(r).getText());
						
				}
				}
		}
	}
}
		



