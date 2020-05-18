package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClassone {
	
	
	public static WebDriver driver;
	
	
	   
	

		 @BeforeMethod
	 
		public void setupnew()  {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\jaju_v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		System.out.println(driver.equals("null"));
		driver.get("https://www.seleniumeasy.com/");
		System.out.println(driver.getTitle());	
		 System.out.println(driver.getCurrentUrl());
		
	 }

	// TEST CASES
		  @Test (priority = 1)
		public void titletest() {
	 	 System.out.println("This is Test 1");
		 System.out.println(driver.getTitle());	
		 System.out.println(driver.getCurrentUrl());
	
	  }
	
	@Test  (priority = 2)
	public void logotest() {		
		System.out.println("This is Test 2 ");
		boolean b = driver.findElement(By.xpath("//a[@class='logo navbar-btn']//img")).isDisplayed();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
	