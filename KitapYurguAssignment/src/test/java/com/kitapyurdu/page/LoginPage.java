package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        methods = new Methods();
    }

    public void userLogin() {

        methods.click(By.cssSelector("#header-top div.menu-top-button.login"));
        methods.waitBySeconds(4);
        methods.sendKeys(By.id("login-email"), "ugur.badem@testinium.com");
        methods.waitBySeconds(4);
        methods.sendKeys(By.cssSelector(".ky-form-group>#login-password"), "1q2w3e4r5t6y7u");
        methods.waitBySeconds(4);
        methods.click(By.cssSelector(".ky-login-btn"));
        methods.waitBySeconds(10);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector("#header-top div.menu.top.login")));
        logger.info("Giriş Başarılı");
        methods.waitBySeconds(3);


    }


}
