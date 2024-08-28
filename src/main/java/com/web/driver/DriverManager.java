package com.web.driver;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DriverManager {

    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return webDriverThreadLocal.get();
    }

    public static void quitDriver(){
        if (webDriverThreadLocal.get()!=null){
            webDriverThreadLocal.get().quit();
            webDriverThreadLocal.remove();
        }
    }

    public static void setDriver(boolean isRemote , String browserType){
        log.info("Setting up {} browser driver", browserType);
        WebDriver driver;
        if (isRemote){
            driver = RemoteDriverFactory.createDriver(browserType);
        }else {
            driver = LocalDriverFactory.createDriver(browserType);
        }
        webDriverThreadLocal.set(driver);
        log.info("Driver setup done for {}", browserType);
    }
}
