package com.syntax.stepDefinitions;


	import org.junit.Assert;

	import com.syntax.pages.LoginPage;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;


	public class LoginPageSteps {
		@Given("^OrangeHRM logo id displayed$")
		public void orangehrm_logo_id_displayed() throws Throwable {
		  
			LoginPage login = new LoginPage();
			Assert.assertTrue(login.logo.isDisplayed());
		    
		}

		@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
		public void i_enter_and(String arg1, String arg2) throws Throwable {
		
		  
		}

		@Then("^I successfully logged in$")
		public void i_successfully_logged_in() throws Throwable {
		   
			
		}

		@When("^I enter <\"([^\"]*)\"> and <\"([^\"]*)\">$")
		public void i_enter (String arg1, String arg2) throws Throwable {
		
		}

		@Then("^I see <\"([^\"]*)\">$")
		public void i_see(String arg1) throws Throwable {
		   
		}


	}



