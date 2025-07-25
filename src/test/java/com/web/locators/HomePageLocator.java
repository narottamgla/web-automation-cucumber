package com.web.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocator {

    @FindBy(xpath = "//button[contains(text(),\"Click me\")]")
    public WebElement clickMeButton;

    @FindBy(linkText = "Sign Up")
    public WebElement signUpLink;

}
