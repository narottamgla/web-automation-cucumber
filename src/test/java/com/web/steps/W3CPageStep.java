package com.web.steps;

import com.web.actions.W3CPageAction;
import com.web.drivers.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class W3CPageStep {

    // Assuming you have a W3CPageAction class similar to HomePageAction
     W3CPageAction w3CPageAction = new W3CPageAction();

    @When("Click on the “Visit W3Schools!” link")
    public void click_on_the_visit_w3schools_link() {
        w3CPageAction.clickVisitW3SchoolsLink();
    }
    @Then("the search input is visible on the new page")
    public void the_search_input_is_visible_on_the_new_page() {
        // Write code here that turns the phrase above into concrete actions
        w3CPageAction.verifySearchInputFieldIsVisible();
    }

}
