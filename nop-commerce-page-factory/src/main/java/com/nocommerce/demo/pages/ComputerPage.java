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
public class ComputerPage extends Util {

    private static Logger log = LogManager.getLogger(ComputerPage.class.getName());


    //    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')] ");
    //    By welcomeTextOfComputers = By.xpath("//h1[contains(text(),'Computers')]");
    //    By deskTopsLink = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    //    By noteBooksLink = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    //    By softwareLink = By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");


    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')] ")
    WebElement _computerLink;
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement _welcomeTextOfComputers;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement _deskTopsLink;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Notebooks')]")
    WebElement _noteBooksLink;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Software')]")
    WebElement _softwareLink;


    public void clickOnComputersLink() {

        log.info("Click on computers link");
        clickOnElement(_computerLink);
    }
    public void clickOnDesktopsLink() {

        log.info("Click on Desktops link");
        clickOnElement(_deskTopsLink);
    }

    public void clickOnNotebooksLink() {
        log.info("Click on notebooks link");
        clickOnElement(_noteBooksLink);
    }

    public void clickOnSoftwareLink() {
        log.info("Click on Software link");
        clickOnElement(_softwareLink);
    }

    public String welcomeText() {
        log.info("Verify WelcomeText");
        return getTextFromElement(_welcomeTextOfComputers);
    }
}