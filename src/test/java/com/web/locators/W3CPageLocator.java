package com.web.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class W3CPageLocator {

    @FindBy(linkText = "Visit W3Schools!")
    public WebElement visitW3SchoolsLink;

    @FindBy(id = "search2")
    public WebElement searchInputField;


}
