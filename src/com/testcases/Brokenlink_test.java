package com.testcases;

import org.testng.annotations.Test;
import com.commonlibrary.Browser;
import com.inputdata.Broken_data;
import com.projectlibrary.Brokenlink;

public class Brokenlink_test {

	Brokenlink homelinks = new Brokenlink();	

	@Test
	public void verify_BrokenLink_home() throws InterruptedException
	{
		Browser.open_chrome_browser();
		Browser.navigate_to(Broken_data.homePage);

		homelinks.Brokenlinks_home();
		
		

	}

	
}
