package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage() {
        methods = new Methods();
    }


    public void scrollAndSelect() {

        methods.sendKeys(By.xpath("//*[@id=\"search-input\"]"), "Oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.cssSelector("#faceted-search-group-5"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"product-451574\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"product-440857\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"product-440988\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"product-395206\"]/div[2]/div[3]/a[5]"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#header-bottom > div > div.logo-text > a > img"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#mainNav div.lvl1catalog "));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.cssSelector("img.landing-button"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#landing-point>div:nth-child(4)>a:nth-child(2)>img"));
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select"),
                "Yüksek Oylama");


    }


}
