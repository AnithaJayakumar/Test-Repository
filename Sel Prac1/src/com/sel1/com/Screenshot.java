package com.sel1.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\driver new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\ANITHA\\eclipse-workspace\\Sel Prac1\\screenshot\\ss.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.close();
		
	}
	

}
