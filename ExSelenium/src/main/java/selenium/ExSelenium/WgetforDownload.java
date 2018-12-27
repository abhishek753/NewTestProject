package selenium.ExSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WgetforDownload {

	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/test/yahoo.html";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		String sourceLocation = downloadButton.getAttribute("href");
		String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
		
		try {
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitval = exec.waitFor();
			System.out.println("Exit value: "+exitval);
		}catch(InterruptedException | IOException ex) {
			System.out.println(ex.toString());
			
		}
		driver.close();
	}

}
