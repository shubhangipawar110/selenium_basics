package com.johndeere.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1OpenEMR {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		
		WebDriver webDriver = new EdgeDriver();
		webDriver.get("https://demo.openemr.io/b/openemr");
		
		String actualTitle = webDriver.getTitle();
		System.out.println("actualTitle--"+actualTitle);
		
		String url = webDriver.getCurrentUrl();
		System.out.println("url--"+url);
		
		String pageSource = webDriver.getPageSource();
		//System.out.println("pageSource--"+pageSource);
		
	}
}
