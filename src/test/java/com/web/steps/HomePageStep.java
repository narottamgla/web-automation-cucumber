package com.web.steps;

import com.web.actions.HomePageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {

    HomePageAction homePageAction= new HomePageAction();

    @Given("User Navigate to the test URL: {string}")
    public void navigate_to_the_test_url(String string) {
        homePageAction.navigateToURL(string);
    }
    @When("User clicks on the button on the screen")
    public void click_on_the_visit_w3schools_link() {
        homePageAction.clickClickMeButton();
    }
    @Then("Sign up button is visible in the new page")
    public void assert_that_the_search_input_is_visible_on_the_new_page() {
        homePageAction.verifyIsSignUpButtonVisible();
    }
}
