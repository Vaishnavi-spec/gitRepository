package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();

		dr.get("https://demo.automationtesting.in/Static.html");

		dr.manage().window().maximize();
		
		WebElement drag1 =dr.findElement(By.id("angular"));
		WebElement drag2 =dr.findElement(By.id("mongo"));
		WebElement drag3=dr.findElement(By.id("node"));
		WebElement drog=dr.findElement(By.id("droparea"));
		
		Actions a1=new Actions(dr);
		
		a1.dragAndDrop(drag1, drog).build().perform();
		a1.dragAndDrop(drag2, drog).build().perform();
		a1.dragAndDrop(drag3, drog).build().perform();
		
		
		
		
		
		
		
		
		
		


	}

}
