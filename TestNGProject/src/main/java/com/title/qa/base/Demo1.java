package com.title.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	public WebDriver driver;{
	System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	
	
	@Test
	  public void verifyHomepageTitle() {
		  System.out.println("Launc Chrome Browser");
		  driver = new ChromeDriver();
		  driver.get(baseUrl);
		  String expectedTitle = "Welcome: Mercury Tours";
		  String actualTitle = driver.getTitle();
		  Assert.assertEquals(actualTitle, expectedTitle);
		  driver.close();
}
}
