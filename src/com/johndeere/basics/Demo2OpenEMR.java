package com.johndeere.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2OpenEMR {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		
		WebDriver webDriver = new EdgeDriver();
		webDriver.get("https://www.facebook.com/");
		
		webDriver.findElement(By.id("email")).sendKeys("abc11@gmail.com");
		webDriver.findElement(By.id("pass")).sendKeys("abcxyz");
		webDriver.findElement(By.name("login")).click();
		
	}
}
