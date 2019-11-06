package com.gmx.pages;

import com.gmx.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath = "//a[@class='logo-link']")
    WebElement _homePageLogo;

    @FindBy (xpath = "//a[contains(text(),'Free Email')]")
    WebElement _freeEmailLink;

    @FindBy (xpath = "//span[contains(text(),'Get your new email')]")
    WebElement _welcomeToFreeEmailPage;

    @FindBy (xpath = "//a[contains(text(),'Features')]")
    WebElement _featuresLink;

    @FindBy (xpath = "//h2[contains(text(),'Online Office')]")
    WebElement _welcomeToFeaturesPage;

    @FindBy (xpath = "//a[contains(text(),'Apps')]")
    WebElement _appsLink;

    @FindBy (xpath = "//span[contains(text(),'GMX Free Email Apps')]")
    WebElement _welcomeToAppsPage;


    public boolean homePageVerification(){
        log.info("HomePage Verification");
        return verifyThatElementIsDisplayed(_homePageLogo);
    }

    public void clickOnFreeEmailLink(){
        clickOnElement(_freeEmailLink);
        log.info("Click on Free Email Link");
    }

    public boolean freeEmailPageVerification(){
        log.info("Free Email Page Verification");
        return verifyThatElementIsDisplayed(_welcomeToFreeEmailPage);
    }

    public void clickOnFeaturesLink(){
        clickOnElement(_featuresLink);
        log.info("Ckick on Feature Link");
    }

    public boolean featuresPageVerification(){
        log.info("Features Page Verification");
        return verifyThatElementIsDisplayed(_welcomeToFeaturesPage);
    }

    public void clickOnAppsLink(){
        clickOnElement(_appsLink);
        log.info("Clcik On Apps Link");
    }

    public boolean appsPageVerification(){
        log.info("Apps page Verification");
        return verifyThatElementIsDisplayed(_welcomeToAppsPage);
    }




}
