package com.web.hooks;

import com.web.drivers.DriverManager;
import com.web.executiondata.AppData;
import com.web.executiondata.GlobalData;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.InputStream;
import java.util.Properties;

@Log4j2
public class Hook {

    @BeforeAll(order = 1)
    public static void setup(){
        String activeProfile = System.getProperty("env","qa");
        log.info("Active profile: " + activeProfile);
        Properties properties = new Properties();
        log.info("Loading properties from property file");

        log.info("Resource URI:"+ Hook.class.getClassLoader().getResource("config.properties"));

        try (InputStream resourceStream = Hook.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (resourceStream == null) {
                throw new RuntimeException("Resource not found: " + "config.properties");
            }
            properties.load(resourceStream);
            log.info("Properties loaded: " + properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //load properties
        AppData.APP_URL.setUrl(properties.getProperty("app_url"));
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
