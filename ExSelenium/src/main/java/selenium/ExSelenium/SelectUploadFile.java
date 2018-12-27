package selenium.ExSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectUploadFile {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/upload/";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		
		uploadElement.sendKeys("D:\\Abhishek Work\\MyArthritisRx\\Defect screenshot\\MyArthritisRx_9.png");
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.name("send")).click();
		driver.close();
	}

}
