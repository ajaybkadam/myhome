package com.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	
	@Test
	public void Taskp2() {
		
	
		System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
	 driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("file:///H:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	
	
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
    
    
 
		
		
		
		
	}
	
	
	
}
