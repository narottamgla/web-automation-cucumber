package com.web.hooks;

import com.web.driver.DriverManager;
import com.web.executiondata.AppData;
import com.web.executiondata.GlobalData;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

@Log4j2
public class Hook {

    @BeforeAll(order = 1)
    public static void setup(){
        //load properties
        log.info("Loading properties from property file");
        AppData.APP_URL.setUrl("https://www.saucedemo.com/v1/");
        log.info("Setting AppData done");
    }

    @BeforeAll(order = 2)
    public static void setupDriver(){
        log.info("Setting up driver");
        DriverManager.setDriver(GlobalData.IS_REMOTE, GlobalData.EXECUTION_BROWSER);
        log.info("Driver setup done");
    }

    @AfterAll(order = 2)
    public static void tearDown(){
        DriverManager.quitDriver();
        log.info("Quit Driver done");
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","Screenshot:");

    }


}
