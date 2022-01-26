package com.sel1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		//simple Alert
		WebElement salert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		salert.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		//confirm alert
		
		WebElement calert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		calert.click();
		Thread.sleep(5000);
		
		WebElement calert1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		calert1.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		//prompt alert
		
		WebElement palert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		palert.click();
		
		Thread.sleep(5000);
		
		WebElement palert1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		palert1.click();
		driver.switchTo().alert().accept();
		
		
		
	}

}
