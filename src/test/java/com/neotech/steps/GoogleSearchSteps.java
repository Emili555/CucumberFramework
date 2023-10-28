package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	@Given("I navigated to Google #precondition")
	public void i_navigated_to_google_precondition() {
	    System.out.println("I go to Google page");
	}

	@When("I type something in the search box # test")
	public void i_type_something_in_the_search_box_test() {
		System.out.println("I search for puppy images");
	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		System.out.println("Click on search");
	}

	@Then("I can see the result of my search")
	public void i_can_see_the_result_of_my_search() {
		System.out.println("Validate results");
		
	}

	@Then("I can see the number of the result")
	public void i_can_see_the_number_of_the_result() {
		System.out.println("Count the number of results");
	}

}
