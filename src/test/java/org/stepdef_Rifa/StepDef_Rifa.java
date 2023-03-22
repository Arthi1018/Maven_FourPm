package org.stepdef_Rifa;

import org.openqa.selenium.WebDriver;

import com.Maven.BaseClass;
import com.Maven.LoginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Rifa extends BaseClass{

	public WebDriver driver = BaseClass.browser_Launch();
	public LoginPom a = new LoginPom(driver);
	
	@Given("Launch the Website")
	public void launch_the_website() {
	   launch_Url("https://adactinhotelapp.com/");
	}
	
	@When("enter {string} username")
	public void enter_username(String user) {

	a.getUsername().sendKeys(user);
	}
	@When("enter {string} password")
	public void enter_password(String pas) {
      a.getPass().sendKeys(pas);
	}


	@Then("click login button")
	public void click_login_button() {
	  click(a.getLogin());
	}
	
}
