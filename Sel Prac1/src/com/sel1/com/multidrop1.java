package com.sel1.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multidrop1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		WebElement multidrop = driver.findElement(By.id("multi-select"));
		
		Select sc = new Select(multidrop);
		System.out.println(sc.isMultiple());
		
		List<WebElement> options = sc.getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
			
			}
		
		int dropsize = options.size();
		System.out.println(dropsize);
		
	  for (int i = 0; i <= dropsize; i++) {
		  if (i==1||i==3||i==5) {
			  
			  sc.selectByIndex(i);
			  
			
		}
		  
		  sc.deselectByValue("1");
		
	}
	 
	  System.out.println("***All selected options****");
	  List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
	  for (WebElement selopt : allSelectedOptions) {
		  String text1 = selopt.getText();
		  System.out.println(text1);
		
	}
	  System.out.println("***First selected options****");
	  WebElement firstSelectedOption = sc.getFirstSelectedOption();
	  String text2 = firstSelectedOption.getText();
	  System.out.println(text2);
		
	}
	
	
}


