package selenium.ExSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadleMultiWindow {

	public static void main(String[] args) {
		
		String baseUrl = "http://demo.guru99.com/popup.php";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				
				driver.findElement(By.name("emailid")).sendKeys("test@test.com");
				driver.findElement(By.name("btnLogin")).click();
				
				driver.close();
			}
			driver.switchTo().window(MainWindow);
		}
		driver.close();
		
	}

}
