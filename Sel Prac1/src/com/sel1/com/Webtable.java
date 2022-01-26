package com.sel1.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		
		driver.manage().window().maximize();
		
		//All data
		System.out.println("All Data");
		
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement Alldata : table) {
			
			String text = Alldata.getText();
			System.out.println(text);
			
		}
		
		//Row data
		System.out.println("Row data");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for (WebElement row : rowdata) {
			
			String text = row.getText();
			System.out.println(text);
			
		}
		
		
		System.out.println("****Column data****");
		
		List<WebElement> coldata = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement col : coldata) {
			
			String text = col.getText();
			System.out.println(text);
		}
		
		
		
	}

}
