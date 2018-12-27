package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseClickKeyboardEvent {

	public static void main(String[] args) {
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);

		WebElement linkhome = driver.findElement(By.linkText("Home"));
		WebElement tdhome = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
		
		Actions builder = new Actions(driver);
		Action mouseoverHome = builder.moveToElement(linkhome).build();
		
		String bgColor = tdhome.getCssValue("background-color");
		System.out.println("Before hover: "+bgColor);
		mouseoverHome.perform();
		bgColor = tdhome.getCssValue("background-color");
		System.out.println("After hover: "+bgColor);
		driver.close();
	}

}
