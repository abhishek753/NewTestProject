package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdpwn {

	public static void main(String[] args) {
		
		String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		
		driver.get("http://jsbin.com/osebed/2");
		Select fruit = new Select(driver.findElement(By.id("fruits")));
		fruit.selectByVisibleText("Banana");
		fruit.selectByIndex(0);

	}

}
