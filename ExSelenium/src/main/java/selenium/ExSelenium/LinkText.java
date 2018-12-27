package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/test/accessing-link.html";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("go here")).click();
		System.out.println("Tittle of page is: "+driver.getTitle());
		driver.close();

	}

}
