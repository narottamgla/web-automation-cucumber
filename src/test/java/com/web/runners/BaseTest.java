package com.web.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:",
        glue = {"com.web.steps","com.web.hooks"},
        dryRun = true,
        plugin = {"html:target/reports.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class BaseTest {
}
