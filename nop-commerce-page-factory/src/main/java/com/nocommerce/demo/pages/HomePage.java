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
public class HomePage extends Util {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());


//    By registerLink = By.linkText("Register");
//    By loginLink = By.linkText("Log in");
//    By currencyList = By.id("customerCurrency");
//    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
//    By electronicsLink = By.linkText("Electronics ");
//    By apparelLink = By.linkText("Apparel ");
//    By digitalDownloadsLink = By.linkText("Digital downloads ");
//    By booksLink = By.linkText("Books ");
//    By jewelryLink = By.linkText("Jewelry ");
//    By giftCardsLink = By.linkText("Gift Cards ");
//    By searchStoreField = By.id("small-searchterms");
//    By searchLBtn = By.className("button-1 search-box-button");

    @FindBy (linkText = "Register")
    WebElement _registerLink;
    @FindBy (linkText = "Log in")
    WebElement _loginLink;
    @FindBy (id = "customerCurrency")
    WebElement _currencyList;
    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computersLink;
    @FindBy (linkText = "Electronics ")
    WebElement _electronicsLink;
    @FindBy (linkText = "Apparel ")
    WebElement _apparelLink;
    @FindBy (linkText = "Digital downloads ")
    WebElement _digitalDownloadsLink;
    @FindBy (linkText = "Books ")
    WebElement _booksLink;
    @FindBy (linkText = "Jewelry ")
    WebElement _jewelryLink;
    @FindBy (linkText = "Gift Cards ")
    WebElement _giftCardsLink;
    @FindBy (id = "small-searchterms")
    WebElement _searchStoreField;
    @FindBy (className = "button-1 search-box-button")
    WebElement _searchLBtn;




    public void clickOnRegisterLink (){
        log.info("Click on register link");
        clickOnElement(_registerLink);
    }

    public void clickOnLoginLink (){
        log.info("Click on Login link");
        clickOnElement(_loginLink); }

    public void selectCurrency (){
        log.info("Select Currency");
        clickOnElement(_currencyList);
        selectByVisibleTextFromDropDown(By.xpath("//option[contains(text(),'US Dollar')]"), "US Dollar");
    }

    public void clickOnComputersLink (){
        log.info("Click on Computers link");
        clickOnElement(_computersLink);
    }

    public void clickOnelectronicsLink(){
        log.info("Click on electronics link");
        clickOnElement(_electronicsLink);
    }

    public void clickOnApparelLink(){
        log.info("Click on Apparel link");
        clickOnElement(_apparelLink);
    }

    public void clickOnDigitalDownloadsLink(){
        log.info("Click on Digital downloads link");
        clickOnElement(_digitalDownloadsLink);
    }

    public void clickOnBooksLink(){
        log.info("Click on Books link");
        clickOnElement(_booksLink);
    }

    public void clickOnJewelryLink(){
        log.info("Click on Jewelry link");
        clickOnElement(_jewelryLink);
    }

    public void clickOnGiftCardsLink(){
        log.info("Click on GiftCards link");
        clickOnElement(_giftCardsLink);
    }

    public void insertTxtInSearchField(){
        log.info("Insert text in search field");
        sendTextToElement(_searchStoreField, "Laptops");
    }

    public void clickOnSearchBtn(){
        log.info("Click on Search button");
        clickOnElement(_searchLBtn);
    }

}
