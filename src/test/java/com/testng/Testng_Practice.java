package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base.BaseClass;

public class Testng_Practice {
	public static WebDriver driver= BaseClass.browser_Launch();
	
	@Test
	private static void apple() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	private static void book() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Arthiha1018");
	}

}
