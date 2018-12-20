package selenium.ExSelenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickImageFB {

	public static void main(String[] args) {
		
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();	
		
		if (driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("We are back at Facebook's homepage");
		}else
		System.out.println("We are not in Facebook's homepage");
		
		driver.close();
	}
	

}
