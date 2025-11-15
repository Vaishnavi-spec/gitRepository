package com.test;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



public class Actionclass {



	public static void main(String[] args) {

	WebDriver dr=new ChromeDriver();

	dr.get("https://accounts.saucelabs.com/am/XUI/#login/");

	dr.manage().window().maximize();

	WebElement txtbox=dr.findElement(By.id("idToken1"));

	txtbox.sendKeys("abcd");

	Actions a=new Actions(dr);

	a.moveToElement(txtbox).contextClick().build().perform();

	a.doubleClick(txtbox).build().perform();

	}



}