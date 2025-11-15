package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd =new ChromeDriver();
		
		wd.get("https://practicetestautomation.com/practice-test-login/");
		wd.manage().window().fullscreen();
		
		/* for login successfully 
		wd.findElement(By.id("username")).click();
		wd.findElement(By.id("username")).sendKeys("student");
     	wd.findElement(By.id("password")).click();
		wd.findElement(By.id("password")).sendKeys("Password123");
		wd.findElement(By.id("submit")).click();
		*/
		
		/* for invalid login 
		wd.findElement(By.id("username")).click();
		wd.findElement(By.id("username")).sendKeys("stu");
		//wd.findElement(By.id("name")).click();
		
		wd.findElement(By.id("password")).click();
		wd.findElement(By.id("password")).sendKeys("Password");
		*/
		
		/*
		wd.findElement(By.id("username")).click();
		wd.findElement(By.id("username")).sendKeys("stud");
		wd.findElement(By.id("username")).clear();
		wd.findElement(By.id("username")).sendKeys("student");
		*/
		
		
		WebElement we=wd.findElement(By.id("username"));
		we.click();
		we.sendKeys("stud");
		we.clear();
		we.sendKeys("stude");
		
		String s=we.getAttribute("value");
		System.out.println(s);
		System.out.println(we.isDisplayed());
		
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
	     System.out.println(we.getLocation());
	     System.out.println(we.getSize());
	     System.out.println(we.getTagName());
	     
//	    
//	    WebElement me =wd.findElement(By.id("submit"));
//	     me.click();
//	     WebElement message =wd.findElement(By.id("error"));
//	     Thread.sleep(4000);
//	     System.out.println(message.getText());
	     
	     
	     
	     //for username invalid 
	        wd.findElement(By.id("username")).click();
			wd.findElement(By.id("username")).sendKeys("user");
			Thread.sleep(1000);
			wd.findElement(By.id("submit")).click();
			WebElement e2=wd.findElement(By.id("error"));
			Thread.sleep(1000);
			System.out.println(e2.getText());
			Thread.sleep(1000);
			
			//for password invalid 
			 wd.findElement(By.id("username")).click();
			wd.findElement(By.id("username")).sendKeys("student");
	        wd.findElement(By.id("password")).click();
			wd.findElement(By.id("password")).sendKeys("Password");
			wd.findElement(By.id("submit")).click();
			WebElement e3=wd.findElement(By.id("error"));
			Thread.sleep(1000);
			System.out.println(e3.getText());
	    
	     
	    
	     
	     
	     
	     
	     
		
		
		

	}

}
