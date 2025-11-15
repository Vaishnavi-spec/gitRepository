package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdroptest {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();

		dr.get("https://demo.guru99.com/test/drag_drop.html");

		dr.manage().window().maximize();
		
  
		WebElement drag =dr.findElement(By.id("fourth"));
		WebElement drog=dr.findElement(By.id("amt7"));
		Actions a1=new Actions(dr);
		a1.dragAndDrop(drag, drog);
		
		
//	WebElement drog=dr.findElement(By.id("droparea"));
//	
//	Actions a1=new Actions(dr);
		

	}

}
