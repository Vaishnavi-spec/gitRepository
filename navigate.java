package com.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new ChromeDriver();
		
		
		obj.get("https://www.google.com");
		
		Thread.sleep(2000);
		obj.get("https://www.gmail.com");
		obj.navigate().back();
		Thread.sleep(2000);
		obj.navigate().forward();
		Thread.sleep(2000);
		obj.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(obj.manage().window().getSize());
		Dimension d=new Dimension(500, 850);
		obj.manage().window().setSize(d); 
		obj.close();
		
		
		

	}

}
