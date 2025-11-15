package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testNG {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver ts =new ChromeDriver();
	        ts.manage().window().maximize();
	     
			ts.get("https://demo.automationtesting.in/Alerts.html");

			WebElement button=ts.findElement(By.xpath("//button[@onclick='alertbox()']"));
			button.click();
			Alert al=ts.switchTo().alert();
			System.out.println(al.getText());
			Thread.sleep(1000);
			al.accept();
			
			WebElement button1=ts.findElement(By.xpath("//a[@href='#CancelTab']"));
			button1.click();
			WebElement button2=ts.findElement(By.xpath("//button[@onclick='confirmbox()']"));
			button2.click();
			
			System.out.println(al.getText());
			Thread.sleep(1000);
			al.accept();
		//	System.out.println(al.getText());
			WebElement wb=ts.findElement(By.id("demo"));
			wb.getText();
			
			
			
		
			
			
	}

}
