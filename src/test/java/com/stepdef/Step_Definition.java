package com.stepdef;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Definition extends BaseClass{
	
	public static WebDriver driver= BaseClass.browser_Launch();
	
	@Given("^Launch the browser and pass the URL$")
	public void launch_the_browser_and_pass_the_URL() {
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	}

	@When("^User enters the username$")
	public void user_enters_the_username(){
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Arthiha1018");
	}

	@When("^User enters the password$")
	public void user_enters_the_password(){
	   
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() {
	 
	}

	@Then("^User gets navigated to the search hotels page$")
	public void user_gets_navigated_to_the_search_hotels_page(){
	 
	}


}
