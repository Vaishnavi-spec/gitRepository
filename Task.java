package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new ChromeDriver();
		WebDriver obj1=new FirefoxDriver();
		
		String str="https://www.google.com";
		obj.get(str);
		
		String str1="https://www.gmail.com";
		obj1.get(str1);
		
		obj.manage().window().maximize();
		
		
		obj1.manage().window().minimize();
		
		System.out.println(obj.getTitle());
		System.out.println(obj1.getCurrentUrl());
		
		Thread.sleep(4000);
		obj.close();
		
		obj1.close();
		
		
	}

}
