package com.title.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		driver = new ChromeDriver();
        driver.get(baseUrl);
	}
	
	@Test
	public void verifyHomePageTitle() {
		String expectertitle = "Welcome: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectertitle);
		
	}
}
