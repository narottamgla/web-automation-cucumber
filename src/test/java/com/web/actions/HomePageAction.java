package com.web.actions;

import com.web.drivers.DriverManager;
import com.web.locators.HomePageLocator;
import com.web.utils.WaitUtil;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class HomePageAction {


    HomePageLocator homePageLocator;
    WaitUtil waitUtil;
    public HomePageAction(){
        homePageLocator = new HomePageLocator();
        waitUtil = new WaitUtil();
        PageFactory.initElements(DriverManager.getDriver(),homePageLocator);
    }

    public void navigateToURL(String url ){
        DriverManager.getDriver().get(url);
    }

    public void clickClickMeButton() {
        waitUtil.waitForElementToBeClickable(homePageLocator.clickMeButton).click();
    }


    public void verifyIsSignUpButtonVisible(){
        //Switch to the new window opened after clicking the button
        String originalWindow = DriverManager.getDriver().getWindowHandle();
        for (String windowHandle : DriverManager.getDriver().getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                DriverManager.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        waitUtil.waitForElementToBeVisible(homePageLocator.signUpLink);
        // Assert that the SignUp button is displayed
        Assert.assertEquals("SignUp button is not visible",homePageLocator.signUpLink.isDisplayed(),true);
    }
}
