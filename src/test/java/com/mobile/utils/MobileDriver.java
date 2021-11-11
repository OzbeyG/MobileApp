package com.mobile.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver {

    static AppiumDriver driver;

    public static AppiumDriver getDriver() throws MalformedURLException {


        try {
            DesiredCapabilities dc = new DesiredCapabilities();

            dc.setCapability("app","optik-tv.apk");
            dc.setCapability("platformName", "Android");
            dc.setCapability("platformVersion", "7.0");
            dc.setCapability("deviceName","Pixel_3");



            URL url = new URL("http://localhost:4723/wd/hb");

            driver = new AppiumDriver<MobileElement>(url,dc);

        }catch (Exception e){e.printStackTrace();}

     return driver;
    }

}
