package com.web.drivers;

import com.web.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriverFactory {
    public static WebDriver createDriver(String browserType) {
        if (browserType.equals(Browser.CHROME.name())){
            return getChromeDriver();
        }else if (browserType.equals(Browser.FIREFOX.name())){
            return getFirefoxDriver();
        }else {
            throw new IllegalArgumentException("Invalid browser type: "+ browserType);
        }

    }

    private static WebDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--enable-precise-memory-info");
       // options.addArguments("--incognito");
        return new ChromeDriver(options);
    }
}
