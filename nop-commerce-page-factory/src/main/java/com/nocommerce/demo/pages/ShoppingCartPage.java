package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Crated By Pratik
 */
public class ShoppingCartPage extends Util {

    private static Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());


//    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
//    By welcomTextshoppingcart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    @FindBy (xpath = "//span[@class='cart-label']")
    WebElement _shoppingCartLink;
    @FindBy (xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement _welcomTextShoppingCart;

    public void clickOnShoppinCartLink() {
        log.info("Click on Shopping cart link");
        clickOnElement(_shoppingCartLink);
        // clickOnElement(shoppingCartLink);
    }

    public String varifyWelcomeText() {
        log.info("Verify shopping cart page");
        return getTextFromElement(_welcomTextShoppingCart);
    }
}
