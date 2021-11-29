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

public class Theinternet_Dragdrop {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(4000);
	
		WebElement A = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		WebElement B = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");"
	    		+ "\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" 
	    		+"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" 
	    		+"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" 
	    		+"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" 
	    		+"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" 
	    		+ "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" "
	    				+ "+ event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) "
	    						+ "{\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);"
	    								+ "\n" +"var dropEvent = createEvent('drop');\n" 
	    						+"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" 
	    								+"var dragEndEvent = createEvent('dragend');\n" 
	    						+"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" 
	    								+"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" 
	    						+"simulateHTML5DragAndDrop(source,destination);",A, B);
		
		Thread.sleep(4000);
		
		 TakesScreenshot t = (TakesScreenshot) driver;
			
			File s = t.getScreenshotAs(OutputType.FILE);
			
			File d = new File("C:\\Users\\Smart\\eclipse-workspace\\Selenium_Bs\\Screenshoot\\theinternetdragdrop.png");
			
			//FileUtils.copyFile(s,d );
			
			FileHandler.copy(s, d);
		
			

	}

}
