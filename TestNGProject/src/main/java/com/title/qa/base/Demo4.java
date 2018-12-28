package com.title.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		driver = new ChromeDriver();
        driver.get(baseUrl);
		
	}
	@BeforeTest
	public void verifyhomePageTitle() {
		String expectertitle = "Welcome: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectertitle);
		
	}
	@Test(priority = 0)
		public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
			
		}
	@Test(priority = 1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	@AfterTest
	public void goBackToHomePage() {
		driver.findElement(By.linkText("Home")).click() ;
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
	}


