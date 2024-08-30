Feature: Verify Login feature for Demo Sauce App

  Scenario: Verify Login with Valid Username and password
    Given User is on application home page
    When User login with username as "standard_user" and password as "secret_sauce"
    Then User should login successfully
