package com.commonlibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.configration.BrowserDrivers;

public class Browser {
	
	public static void open_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\selenium\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		
		
		BrowserDrivers.driver=new ChromeDriver();
		
		BrowserDrivers.driver.manage().deleteAllCookies();
		BrowserDrivers.driver.manage().window().maximize();
		BrowserDrivers.driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	}
	
	public static void navigate_to(String url)
	
	{
		BrowserDrivers.driver.navigate().to(url);
	}

}
