package com.web.actions;

import com.web.driver.DriverManager;
import com.web.executiondata.AppData;
import com.web.locator.LoginPageLocator;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class LoginPageAction {

    LoginPageLocator loginPageLocator;
    public LoginPageAction(){
     loginPageLocator = new LoginPageLocator();
     PageFactory.initElements(DriverManager.getDriver(),loginPageLocator);
    }

    public void verifyNavigationLoginPage(){
        DriverManager.getDriver().get(AppData.APP_URL.getUrl());
        Assert.assertTrue("Login Page Logo Not displayed",loginPageLocator.homePageLogo.isDisplayed());
    }

    public void loginToApp(String userName, String password)
    {
     loginPageLocator.userNameTxBx.clear();
     loginPageLocator.userNameTxBx.sendKeys(userName);
     loginPageLocator.passwordTxBx.clear();
     loginPageLocator.passwordTxBx.sendKeys(password);
     loginPageLocator.loginButton.click();
    }

    public void verifyIsLoginSuccssful(){
        Assert.assertEquals("Login is not successful",loginPageLocator.productHomePageHeader.getText(),"Products");
    }






}
