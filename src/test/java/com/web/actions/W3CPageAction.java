package com.web.actions;

import com.web.drivers.DriverManager;
import com.web.locators.HomePageLocator;
import com.web.locators.W3CPageLocator;
import com.web.utils.WaitUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class W3CPageAction {

    W3CPageLocator w3CPageLocator;
    WaitUtil waitUtil;
    public W3CPageAction(){
        w3CPageLocator = new W3CPageLocator();
        waitUtil = new WaitUtil();
        PageFactory.initElements(DriverManager.getDriver(),w3CPageLocator);
    }

    public void navigateToURL(String url ){
        DriverManager.getDriver().get(url);
    }

    public void clickVisitW3SchoolsLink() {
        //swicth to frame before clicking the link
        WebDriver driver = DriverManager.getDriver();
        driver.switchTo().frame("iframeResult");
        waitUtil.waitForElementToBeClickable(w3CPageLocator.visitW3SchoolsLink).click();
    }
    public void verifySearchInputFieldIsVisible() {
        //swich to the new window opened after clicking the link
        String originalWindow = DriverManager.getDriver().getWindowHandle();
        for (String windowHandle : DriverManager.getDriver().getWindowHandles()) {

            if (!windowHandle.equals(originalWindow)) {
                DriverManager.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        waitUtil.waitForElementToBeVisible(w3CPageLocator.searchInputField);
        boolean isVisible = w3CPageLocator.searchInputField.isDisplayed();
        Assert.assertTrue("Search input field is not visible", isVisible);
    }
}
