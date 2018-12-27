package selenium.ExSelenium;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchRowColumnDynamicTables {

	public static void main(String[] args) throws ParseException {
		
		WebDriver wd;
		String baseUrl = "http://money.rediff.com/gainers/bsc/dailygroupa?";
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/eclipse-workspace/POMTest/Driver/chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(baseUrl);
		wd.manage().window().maximize();
		
		//No.of Columns
		List col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of cols are: "+col.size());
		
        //No.of rows 
		List rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows are: "+rows.size());
		wd.close();

	}

}
