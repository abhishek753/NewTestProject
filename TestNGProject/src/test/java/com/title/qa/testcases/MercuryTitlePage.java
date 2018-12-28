package com.title.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.title.qa.base.TestBase;
import com.title.qa.pages.TitlePage;

public class MercuryTitlePage extends TestBase {
	TitlePage titlepage;
	@Test
	public void mercuryTitlePage() {
		
		String title = titlepage.mercuryTitlePage();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}

}
