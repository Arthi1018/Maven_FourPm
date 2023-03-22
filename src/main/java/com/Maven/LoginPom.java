package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	private WebDriver driver;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
