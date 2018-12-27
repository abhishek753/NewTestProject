package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActions {

	public static void main(String[] args) {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action seriesofActions = builder.moveToElement(txtUsername)
				.click().keyDown(txtUsername,Keys.SHIFT)
				.sendKeys(txtUsername,"Hello")
				.keyUp(txtUsername,Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick().build();
		
		seriesofActions.perform();
		driver.close();

	}

}
