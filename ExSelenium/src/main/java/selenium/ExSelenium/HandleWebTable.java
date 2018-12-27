package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		
		System.out.println(innerText);
		driver.close();
		main1(args);

	}
	public static void main1(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
		System.out.println(innerText);
		driver.close();
		main2(args);
	}
	public static void main2(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[3]/td")).getText();
		System.out.println(innerText);
		driver.close();
		
	}

}

