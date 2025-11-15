package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr =new ChromeDriver();
		//WebDriver dr1 =new FirefoxDriver();
		//WebDriver dr2 =new EdgeDriver();
		//WebDriver dr3 =new InternetExplorerDriver();
		//dr.get("https://www.google.com");
		String str="https://www.google.com";
		dr.get(str);
		
		//dr.manage().window().minimize();
		dr.manage().window().maximize();
		Thread.sleep(4000);

		System.out.println(dr.getTitle());
		dr.close();
		

	}

}
