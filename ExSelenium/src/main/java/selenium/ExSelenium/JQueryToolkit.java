package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryToolkit {

	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/test/tooltip.html";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		String expectedTooltip = "What's new in 3.2";
		
		WebElement download = driver.findElement(By.xpath(".//*[@id=\'download_now\']"));
		Actions builder = new Actions(driver);
		
		builder.clickAndHold().moveToElement(download);
		builder.moveToElement(download).build().perform();
		
		WebElement toolkitElemet = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
		String actualTooltip = toolkitElemet.getText();
		
		System.out.println("Actual Title of toolkit: "+actualTooltip);
		if(actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test case Passed");
		}
		driver.close();
	}

}
