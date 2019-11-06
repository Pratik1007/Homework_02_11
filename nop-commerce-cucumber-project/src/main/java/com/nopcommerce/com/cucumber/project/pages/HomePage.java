package com.nopcommerce.com.cucumber.project.pages;

import com.nopcommerce.com.cucumber.project.browserselector.BrowserSelector;
import com.nopcommerce.com.cucumber.project.utility.Util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends Util {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());


    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By currencyList = By.id("customerCurrency");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By welcomeTextComputersPage = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsLink = By.linkText("Electronics");
    By welcomeTextElectronicsPage = By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelLink = By.linkText("Apparel");
    By welcomeTextApparelPage = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By welcomeTextDigitalDownloadsPage = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksLink = By.linkText("Books");
    By welcomeTextBooksPage = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryLink = By.linkText("Jewelry");
    By welcomeTextJewelryPage = By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsLink = By.linkText("Gift Cards");
    By welcomeTextGiftCardsPage =By.xpath("//h1[contains(text(),'Gift Cards')]");
    By registerBtn = By.id("register-button");
    By searchStoreField = By.id("small-searchterms");
    By searchLBtn = By.className("button-1 search-box-button");

    public void clickOnRegisterLink (){
        clickOnElement(registerLink);
        log.info("Clcik On Register Link");
    }

    public void clickOnLoginLink (){
        clickOnElement(loginLink);
        log.info("Click On Login Link");
    }

    public void selectCurrency (){
        clickOnElement(currencyList);
        selectByVisibleTextFromDropDown(By.xpath("//option[contains(text(),'US Dollar')]"), "US Dollar");
        log.info("SelectCurrency");
    }

    public void clickOnComputersLink (){
        clickOnElement(computersLink);
        log.info("Click On Computers Link");
    }

    public String computersText(){ return getTextFromElement(welcomeTextComputersPage); }

    public void clickOnElectronicsLink(){
        clickOnElement(electronicsLink);
        log.info("Clcik On Electronics Link");
    }

    public String electronicsText(){ return getTextFromElement(welcomeTextElectronicsPage); }


    public void clickOnApparelLink(){
        clickOnElement(apparelLink);
        log.info("Click On Apparel Link");
    }

    public String apparelText(){ return getTextFromElement(welcomeTextApparelPage); }


    public void clickOnDigitalDownloadsLink(){
        clickOnElement(digitalDownloadsLink);
        log.info("Click On Digital Downloads Link");
    }

    public String digitalDownloadText(){ return getTextFromElement(welcomeTextDigitalDownloadsPage); }


    public void clickOnBooksLink(){
        clickOnElement(booksLink);
        log.info("Click On Books Link");
    }

    public String booksText(){ return getTextFromElement(welcomeTextBooksPage); }


    public void clickOnJewelryLink(){
        clickOnElement(jewelryLink);
        log.info("Click On Jewelry Link");
    }

    public String jewelryText(){ return getTextFromElement(welcomeTextJewelryPage); }


    public void clickOnGiftCardsLink(){
        clickOnElement(giftCardsLink);
        log.info("Click On GiftCards Link");
    }

    public String giftCardsText(){ return getTextFromElement(welcomeTextGiftCardsPage); }


    public void clickOnRegisterBtn(){
        clickOnElement(registerBtn);
        log.info("Click On Register Button");
    }

    public void insertTxtInSearchField(){
        sendTextToElement(searchStoreField, "Laptops");
        log.info("Insert Text 'Laptops'");
    }

    public void clickOnSearchBtn(){
        clickOnElement(searchLBtn);
        log.info("Click On Search Button");
    }

}
