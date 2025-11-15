package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabhandle {

	public static void main(String[] args) {
     WebDriver ts =new ChromeDriver();
        ts.manage().window().maximize();
        String pw=ts.getWindowHandle();
		ts.get("https://www.google.com");
		ts.switchTo().newWindow(WindowType.TAB);
		String cw=ts.getWindowHandle();
		ts.get("https://www.gmail.com");
		ts.switchTo().newWindow(WindowType.TAB);
		String tw=ts.getWindowHandle();
		ts.get("https.//www.flipcart.com");
		
		ts.switchTo().window(cw);
		ts.switchTo().window(pw);
		ts.switchTo().window(tw).close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
