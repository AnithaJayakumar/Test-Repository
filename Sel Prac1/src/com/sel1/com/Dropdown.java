package com.sel1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

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
	
     WebElement dateno = driver.findElement(By.id("day"));
     
     Select s = new Select(dateno);
     s.selectByValue("9");
     
     
     WebElement month = driver.findElement(By.id("month"));
     
     Select s1 = new Select(month);
     s1.selectByVisibleText("Mar");
     
     WebElement year = driver.findElement(By.id("year"));
     
     Select s2 = new Select(year);
     s2.selectByValue("2019");
     
	
	
	
}
}
