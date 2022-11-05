package com.kitapyurdu.driver;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    public static WebDriver driver;

    @BeforeAll
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notification");
        chromeOptions.addArguments("--disable-gpv");
        chromeOptions.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.kitapyurdu.com/");

    }

    @AfterAll
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

    }


}
