package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless {

	public static void main(String[] args) {
		ChromeOptions cc=new ChromeOptions();
		cc.addArguments("headless");
		WebDriver dr=new ChromeDriver(cc);
		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
		
		
		FirefoxOptions ff= new FirefoxOptions();
		ff.addArguments("--headless");
		WebDriver fr=new FirefoxDriver(ff);
		fr.get("https://www.gmail.com");
		System.out.println(fr.getTitle());
		
		ChromeOptions ii=new ChromeOptions();
		ii.addArguments("incognito");
		WebDriver cd=new ChromeDriver(ii);
		cd.get("https://www.google.com");
		System.out.println(cd.getTitle());
		
		
		

	}

}
