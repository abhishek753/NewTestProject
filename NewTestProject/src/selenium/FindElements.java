package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.out.println("Begin");
		System.setProperty("webdriver.geckodriver.driver", "D:/Abhishek Work/Software/Driver/geckodriver.exe");
		System.out.println("Onway");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Start");
		driver.get("www.google.com");
		System.out.println("End");

	}

}
