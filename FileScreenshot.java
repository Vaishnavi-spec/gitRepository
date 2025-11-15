package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import com.google.common.io.Files;

public class FileScreenshot {

	public static void main(String[] args) throws IOException {
	
		WebDriver dr=new ChromeDriver();

		dr.get("https://demo.guru99.com/test/drag_drop.html");

		dr.manage().window().maximize();
		 java.io.File screenshot = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		 Files.copy(screenshot, new File("C:\\Users\\CDAC\\Desktop\\DSA"));
		 
		
		
	}

}
