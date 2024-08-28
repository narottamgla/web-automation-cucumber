package com.web.hooks;

import com.web.driver.DriverManager;
import com.web.executiondata.AppData;
import com.web.executiondata.GlobalData;
import io.cucumber.java.BeforeAll;
import lombok.extern.log4j.Log4j2;

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
}
