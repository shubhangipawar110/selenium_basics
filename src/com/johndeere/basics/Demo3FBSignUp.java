package com.johndeere.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize(); 
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		webDriver.get("https://www.facebook.com/");
		webDriver.findElement(By.linkText("Create New Account")).click();
		
		webDriver.findElement(By.name("firstname")).sendKeys("shubhangee");
		webDriver.findElement(By.name("lastname")).sendKeys("pawar");
		webDriver.findElement(By.name("reg_email__")).sendKeys("8888888888");
		webDriver.findElement(By.name("reg_passwd__")).sendKeys("pawar112");
		
		//webDriver.findElement(By.xpath("//input[@value='1']")).click();
		webDriver.findElement(By.cssSelector("input[value='2']")).click();
		
		Select selectDay = new Select(webDriver.findElement(By.id("day")));
		selectDay.selectByVisibleText("7");
		
		Select selectMonth = new Select(webDriver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Mar");
		
		Select selectYear = new Select(webDriver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1994");
		
		webDriver.findElement(By.name("websubmit")).click();
	}

}
