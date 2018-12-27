package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
		System.out.println(theLinkText);
		theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println(theLinkText);
		driver.close();
	}

}
