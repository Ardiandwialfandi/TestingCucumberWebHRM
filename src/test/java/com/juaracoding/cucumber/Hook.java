package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constant;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hook {

    public static WebDriver driver;
    public static LoginPage pageLog = new LoginPage();

    @Before
    public static void setUp() {
        DriverSingleton.getInstance(Constant.CHROME);
        driver = DriverSingleton.getDriver();
    }

    @AfterAll
    public static void close_object() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }


    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
