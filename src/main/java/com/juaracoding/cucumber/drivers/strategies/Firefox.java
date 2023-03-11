package com.juaracoding.cucumber.drivers.strategies;

import com.juaracoding.cucumber.utils.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", Constant.FIREFOXDRIVER);
        driver = new FirefoxDriver();
        return driver;
    }
}
