package com.web.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocator {

    @FindBy(css = ".login_logo")
    public WebElement homePageLogo;

    @FindBy(id = "user-name")
    public WebElement userNameTxBx;

    @FindBy(id = "password")
    public WebElement passwordTxBx;

    @FindBy(id="login-button")
    public WebElement loginButton;

    @FindBy(css = "#inventory_filter_container .product_label")
    public WebElement productHomePageHeader;

    


}
