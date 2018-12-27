package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkInsideOutsideBlock {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/block.html";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
