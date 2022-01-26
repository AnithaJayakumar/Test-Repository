package com.sel1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//single frame
		
		WebElement sframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(0);
		
		WebElement sframe1 = driver.findElement(By.xpath("//input[@type='text']"));
		sframe1.sendKeys("Anitha");
		//Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		
		//nested frame
		
		Thread.sleep(5000);
		
		WebElement cframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		cframe.click();
		
		Thread.sleep(5000);
		WebElement cframe1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(cframe1);
		
		WebElement cframe2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(cframe2);
		
		WebElement cframe3 = driver.findElement(By.xpath("//input[@type='text']"));
		cframe3.sendKeys("test");
		driver.switchTo().defaultContent();
		
		
	}

}
