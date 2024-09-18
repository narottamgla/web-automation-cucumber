package com.web.utils;

import com.web.drivers.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WaitUtil {

    /**
     * Waits for a WebElement to be visible and returns it.
     *
     * @param element WebElement to be found
     * @return WebElement that is visible
     */
    public WebElement waitForElementToBeVisible(WebElement element) {
        return new FluentWait<>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(30))        // Maximum wait time of 30 seconds
                .pollingEvery(Duration.ofMillis(500))       // Retry frequency of 500 milliseconds
                .ignoring(NoSuchElementException.class)    // Ignore if element is not found initially
                .until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits for a WebElement to be clickable and returns it.
     *
     * @param element WebElement to be found
     * @return WebElement that is clickable
     */
    public WebElement waitForElementToBeClickable(WebElement element) {
        return new FluentWait<>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Waits for a specific condition to be true.
     *
     * @param condition ExpectedCondition representing the condition
     * @return true if the condition is met within the timeout
     */
    public boolean waitForCondition(ExpectedCondition<Boolean> condition) {
        return new FluentWait<>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class)
                .until(condition);
    }
}
