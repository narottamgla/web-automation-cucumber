package com.web.actions;

import com.web.drivers.DriverManager;
import com.web.executiondata.AppData;
import com.web.locators.LoginPageLocator;
import com.web.utils.WaitUtil;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class LoginPageAction  {

    LoginPageLocator loginPageLocator;
    WaitUtil waitUtil;
    public LoginPageAction(){
     loginPageLocator = new LoginPageLocator();
     waitUtil = new WaitUtil();
     PageFactory.initElements(DriverManager.getDriver(),loginPageLocator);
    }

    public void verifyNavigationLoginPage(){
        DriverManager.getDriver().get(AppData.APP_URL.getUrl());
        Assert.assertTrue("Login Page Logo Not displayed",loginPageLocator.homePageLogo.isDisplayed());
    }

    public void loginToApp(String userName, String password)
    {
        waitUtil.waitForElementToBeVisible(loginPageLocator.userNameTxBx).clear();
        loginPageLocator.userNameTxBx.sendKeys(userName);
        waitUtil.waitForElementToBeVisible(loginPageLocator.passwordTxBx).clear();
        loginPageLocator.passwordTxBx.sendKeys(password);
        waitUtil.waitForElementToBeClickable(loginPageLocator.loginButton).click();
    }

    public void verifyIsLoginSuccssful(){
        Assert.assertEquals("Login is not successful",loginPageLocator.productHomePageHeader.getText(),"Products");
    }
}
