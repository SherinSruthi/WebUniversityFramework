package WebdriverUniversityFramework.Steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactusSteps {
	
	@When("^I click on the contact us button$")
	public void i_click_on_the_contact_us_button() throws Throwable {
	   System.out.println("I click on the contact us button");
	}

	@When("^I enter an valid firstname$")
	public void i_enter_an_valid_firstname() throws Throwable {
		System.out.println("I enter an valid firstname");
	}

	@When("^I enter a valid lastname$")
	public void i_enter_a_valid_lastname() throws Throwable {
		System.out.println("I enter a valid lastname$");
	}

	@When("^I enter an valid emailaddress$")
	public void i_enter_an_valid_emailaddress() throws Throwable {
		System.out.println("I enter an valid emailaddress");
	}

	@When("^I enter a comment$")
	public void i_enter_a_comment() throws Throwable {
		System.out.println("I enter a comment");
	}

	@When("^I clik on the submit button$")
	public void i_clik_on_the_submit_button() throws Throwable {
		System.out.println("I clik on the submit button");
	}

	@Then("^Information should be submitted successfully via contact us form$")
	public void information_should_be_submitted_successfully_via_contact_us_form() throws Throwable {
		System.out.println("Information should be submitted successfully via contact us form");
	}

	@When("^I enter an invalid firstname$")
	public void i_enter_an_invalid_firstname() throws Throwable {
		System.out.println("I enter an invalid firstname");
	}

	@When("^I enter a invalid lastname$")
	public void i_enter_a_invalid_lastname() throws Throwable {
		System.out.println(" I enter a invalid lastname");
	}

	@When("^I enter an invalid emailaddress$")
	public void i_enter_an_invalid_emailaddress() throws Throwable {
		System.out.println("I enter an invalid emailaddress");
	}

	@When("^I enter a no comment$")
	public void i_enter_a_no_comment() throws Throwable {
		System.out.println("I enter a no comment");
	}

	@When("^I clik on the reset button$")
	public void i_clik_on_the_reset_button() throws Throwable {
		System.out.println("I clik on the reset button");
	}

	@Then("^Information should not be submitted  via contact us form$")
	public void information_should_not_be_submitted_via_contact_us_form() throws Throwable {
		System.out.println("Information should not be submitted  via contact us form");
	}

}
