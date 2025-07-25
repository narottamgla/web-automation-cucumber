Feature: Verify Login feature for Demo Sauce App

  Scenario: User should be able to see sign up button
    Given User Navigate to the test URL: "https://v0-button-to-open-v0-home-page-h5dizpkwp.vercel.app/"
    When User clicks on the button on the screen
    Then Sign up button is visible in the new page

  Scenario: User should be able to see search input
    Given User Navigate to the test URL: "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_target"
    When Click on the “Visit W3Schools!” link
    Then the search input is visible on the new page
