package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialPoint {

	public static void main(String[] args) {
		
   WebDriver sd =new ChromeDriver();
		
		sd.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		sd.manage().window().fullscreen();
		
		WebElement we=sd.findElement(By.id("name"));
		we.click();
		we.sendKeys("vaishnavi");
		WebElement we1=sd.findElement(By.id("email"));
		we1.click();
		we1.sendKeys("abc@123");
		
         /*for male button 
		WebElement we2=sd.findElement(By.id("gender"));
		we2.click();
		*/
		
		
		
		
//		WebElement we2=sd.findElement(By.xpath("//label [text() ='Female']"));
//		we2.click();
		
		WebElement we3=sd.findElement(By.xpath("//input[@id='name']//following::input[3]"));
		we3.click();
		
		//mobile
		WebElement we4=sd.findElement(By.xpath("//input[@id='name']//following::input[5]"));
		we4.sendKeys("7709232088");
		
		//math
		WebElement we5=sd.findElement(By.xpath("//input[@id='name']//following::input[7]"));
		we5.sendKeys("math");
		
		//hobby
		WebElement we6=sd.findElement(By.xpath("//input[@id='name']//following::input[8]"));
		we6.click();
		
		WebElement we7=sd.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));
		we7.sendKeys("Ring road ,Jalgaon ");
		
		
		//for state drop down 
		WebElement state=sd.findElement(By.id("state"));//you can do this using xpath //select[@id='state']
		Select sr=new Select(state);
		sr.selectByIndex(3);
		System.out.println(state.getText());
		
	
		//for city 
		WebElement city=sd.findElement(By.id("city"));//you can do this using xpath //select[@id='state']
		Select st=new Select(city);
		st.selectByIndex(1);
		System.out.println(city.getText());
		
		
		
	
		sd.findElement(By.id("picture")).sendKeys("C:\\Users\\CDAC\\Desktop\\ss.jpeg");
		
		
		WebElement login=sd.findElement(By.xpath("//a[@href='login.php']"));
	    login.click();
		
		
		
		
		
		
	}

}
