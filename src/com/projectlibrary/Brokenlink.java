package com.projectlibrary;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.commonlibrary.Keywords;
import com.inputdata.Broken_data;
import com.locators.Broken_elements;

public class Brokenlink {

	public void Brokenlinks_home() throws InterruptedException
	
	{
		String homePage=Broken_data.homePage;		
		String url =Broken_data.url;
		HttpURLConnection huc = Broken_data.huc;
		int respCode = Broken_data.respCode;
		
		
		List<WebElement> links = Keywords.getlist_links(Broken_elements.tag);

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

		 url = it.next().getAttribute(Broken_data.attribute);

			System.out.println(url);

			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if(!url.startsWith(homePage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {
				huc = (HttpURLConnection)(new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if(respCode >= 400){
					System.out.println(url+" is a broken link");
				}
				else{
					System.out.println(url+" is a valid link");
				}

			} catch (MalformedURLException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}



	}
	
}
