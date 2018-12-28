package com.title.qa.base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_In_TestNG {
	
	WebDriver driver;
	public String baseUrl = "http://www.google.co.in";
	
	@Test
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	

	
	@Test
	public void performSearchAndClick() {
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	}
	
	@Test
	public void facebookPageTitleVerification() throws Exception {
		driver.findElement(By.xpath(".//*[@value='Search']")).click();	
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
	}

}
