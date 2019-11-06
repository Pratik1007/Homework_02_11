package uk.org.redcross.cucumber.project.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.org.redcross.cucumber.project.utility.Util;

public class HomePage extends Util {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Get help")
    WebElement _getHelpLink;
    @FindBy(xpath = "//h1[@class='small']")
    WebElement _welcomeToGetHelpPage;

    @FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement _getInvolvedLink;
    @FindBy(xpath = "//h1[@class='small']")
    WebElement _welcomeToGetInvolvedPage;

    @FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement _firstAidLink;
    @FindBy(xpath = "//h1[@class='small']")
    WebElement _welcomeToFirstAidPage;

    @FindBy(linkText = "About us")
    WebElement _aboutUsLink;
    @FindBy(xpath = "//h1[@class='small']")
    WebElement _welcomeToAboutUsPage;

    @FindBy(linkText = "Shop")
    WebElement _shopLink;
    @FindBy(xpath = "//h1[contains(text(),'charity shops')]")
    WebElement _welcomeToShopPage;

    public void clickOnGetHelpLink() {
        clickOnElement(_getHelpLink);
    }

    public String getTextfromGetHelpPage() {
        return getTextFromElement(_welcomeToGetHelpPage);
    }

    public void clickOnGetInvolvedLink() {
        clickOnElement(_getInvolvedLink);
    }

    public String getTextFromGetInvolvedPage() {
        return getTextFromElement(_welcomeToGetInvolvedPage);
    }

    public void clickOnFirstAidLink() {
        clickOnElement(_firstAidLink);
    }

    public String getTextFromFirstAidPage() {
        return getTextFromElement(_welcomeToFirstAidPage);
    }

    public void clickOnAboutUsLink() {
        clickOnElement(_aboutUsLink);
    }

    public String getTextFromAboutUsPage() {
        return getTextFromElement(_welcomeToAboutUsPage);
    }

    public void clickOnShopLink() {
        clickOnElement(_shopLink);
    }

    public String getTextFromShopPage() {
        return getTextFromElement(_welcomeToShopPage);
    }

}
