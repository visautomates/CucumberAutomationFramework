package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginfeature {
	
	@Given("User on login page")
	public void user_on_login_page() {
		   System.out.println("vis");
	}

	@When("User enter valid credential")
	public void user_enter_valid_credential() {
		   System.out.println("is");
	}

	@When("Click on login")
	public void click_on_login() {
		   System.out.println("soo");
	}

	@Then("user is successfully logged into homepage")
	public void user_is_successfully_logged_into_homepage() {
	    System.out.println("cool");
	}


}
