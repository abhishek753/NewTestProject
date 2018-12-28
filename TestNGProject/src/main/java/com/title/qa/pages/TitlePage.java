package com.title.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;

import com.title.qa.base.TestBase;

public class TitlePage extends TestBase {
	
	//Initializing the Page objects/Factory/OR:
		public TitlePage() {
			PageFactory.initElements(driver, this);
		}
	public String mercuryTitlePage() {
		return driver.getTitle();
	}

}
