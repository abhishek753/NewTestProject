package selenium.ExSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleDemo {

	public static void main(String[] args) {
		
		String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		driver.findElement(By.name("cusid")).sendKeys("53290");
		driver.findElement(By.name("submit")).submit();
		
		 // Switching to Alert  
		Alert alert = driver.switchTo().alert();
		
		 // Capturing alert message. 
		String alertMessage = driver.switchTo().alert().getText();
		
		// Displaying alert message
		System.out.println(alertMessage);
		
		alert.accept();

	}

}
