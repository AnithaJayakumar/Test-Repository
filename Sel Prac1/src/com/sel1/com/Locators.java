package com.sel1.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Test234@gmail.com");
	
	WebElement Pw = driver.findElement(By.id("pass"));
	Pw.sendKeys("12345678");
	
	WebElement crtnewbt = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	crtnewbt.click();
	
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
	Thread.sleep(5000);
	
	WebElement frstname = driver.findElement(By.name("firstname"));
	frstname.sendKeys("Anitha");
	
	
	WebElement secname = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]"));
	secname.sendKeys("J");
	
	//WebElement ph = driver.findElement(By.xpath("//input[text()='Mobile number or email address']"));
	//ph.sendKeys("988656543243");
	
	}

}
