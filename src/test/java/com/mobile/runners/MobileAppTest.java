package com.mobile.runners;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


@RunWith(Cucumber.class)
@CucumberOptions(
           plugin = {
                      "pretty",
                  "html:target/html_reports.html",
                   "json:target/cucumber_reports.json"
          },
         features = "src/test/resources/mobile.feature",
        glue = "com/mobile/step_definitions",
         dryRun = false

)
public class MobileAppTest {



}
