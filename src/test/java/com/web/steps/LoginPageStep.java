package com.web.steps;

import com.web.actions.LoginPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {

    LoginPageAction loginPageAction= new LoginPageAction();

    @Given("User is on application home page")
    public void user_is_on_application_home_page() {
        loginPageAction.verifyNavigationLoginPage();
    }
    @When("User login with username as {string} and password as {string}")
    public void user_login_with_username_as_and_password_as(String userName, String password) {
        loginPageAction.loginToApp(userName,password);
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        loginPageAction.verifyIsLoginSuccssful();
    }

}
