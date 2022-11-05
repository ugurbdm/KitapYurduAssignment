package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.ProductPage;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MainTest extends BaseTest {


    @Test
    @Order(1)
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.userLogin();
    }

    @Test
    @Order(2)
    public void productTest() {
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();

    }


}
