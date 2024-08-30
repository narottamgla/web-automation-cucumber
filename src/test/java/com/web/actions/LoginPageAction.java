package com.web.actions;

import com.web.driver.DriverManager;
import com.web.locator.LoginPageLocator;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class LoginPageAction {

    LoginPageLocator loginPageLocator;
    public LoginPageAction(){
     loginPageLocator = new LoginPageLocator();
     PageFactory.initElements(DriverManager.getDriver(),LoginPageLocator.class);
    }

    public void verifyNavigationLoginPage(){
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

    public void verifyIsLoginSuccssfull(){
        Assert.assertEquals("Login is not successfull",loginPageLocator.homePageLogo.getText(),"Products");
    }






}
