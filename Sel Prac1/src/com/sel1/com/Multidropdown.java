package com.sel1.com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		//single dropdown
		
		WebElement singledrop = driver.findElement(By.id("select-demo"));
		
		Select s1 = new Select(singledrop);
		s1.selectByValue("Monday");
		
		
		WebElement multidrop = driver.findElement(By.id("multi-select"));
		Select sc = new Select(multidrop);
		
		boolean multipledrop = sc.isMultiple();
		System.out.println("dropdown is "+multipledrop); //to check multiple dropdown
		
		List<WebElement> options = sc.getOptions(); //to get all options in drop down
		for (WebElement Alloptions : options) {
			String text = Alloptions.getText();
			System.out.println(text);
		}
	
		
		int dropsize = options.size();
		System.out.println("Size of dropdown="+dropsize);
		
		for (int i = 0; i <=dropsize; i++) {
			
		     if (i==0||i==3||i==5) {
		    	 
		    	 sc.selectByIndex(i);
				
			}
			
		}
		
		
		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		for (WebElement seloptions : allSelectedOptions) {
			String text1 = seloptions.getText();
			System.out.println("selected options:"+ text1);
			
		}
		
		
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		String text3 = firstSelectedOption.getText();
		System.out.println("firstSelectedOption"+text3);
}
	
}
