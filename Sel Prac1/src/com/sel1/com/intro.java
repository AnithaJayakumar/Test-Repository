package com.sel1.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {
	
	
 public static void main(String[] args) {
	
	 
	 System.setProperty("webdriver.chrome.driver", 
			 "C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.selenium.dev/downloads/");
	 
	 String pgtitle = driver.getTitle();
	 System.out.println("Title:"+pgtitle);
	 
	 driver.manage().window().maximize();
	 
	 driver.navigate().to("https://www.loyolacollege.edu/pulc/admissions");
	 
	 driver.navigate().forward();
	 
	 driver.navigate().back();
	 
	 driver.navigate().refresh();
	 
	 String PgcurrentUrl = driver.getCurrentUrl();
	 System.out.println("CurrentUrl:"+PgcurrentUrl);
	 
	 driver.close();
	 
	 
}

}
