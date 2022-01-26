package com.sel1.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class winhandle {
	
	public static void main(String[] args) throws AWTException   {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?tag=siteplug833-21");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		ac.contextClick(mobile).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Bestseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(Bestseller).build().perform();
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement electronics = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(electronics).build().perform();
		
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> wh = driver.getWindowHandles();
		for (String stringid : wh) {
			String title = driver.switchTo().window(stringid).getTitle();
			System.out.println("Title"+title);
			
		}
		
		String actualTitle = "The most popular items on Amazon";
		
		for (String stringlst : wh) {
			
			if (driver.switchTo().window(stringlst).getTitle().equals(actualTitle)) {
				break;
				
			}
		}
		
	}
	
	
	
	

}
