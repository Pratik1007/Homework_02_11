package uk.org.redcross.cucumber.project.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.org.redcross.cucumber.project.utility.Util;

public class SearchPage extends Util {

    private static Logger log = LogManager.getLogger(SearchPage.class.getName());

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    WebElement _searchLink;
    @FindBy (xpath = "//button[@class='search active']")
    WebElement _closeBtnOfSearchPage;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement _searchField;
    @FindBy(xpath = "//div[@class='wrapper']//form//button")
    WebElement _searchBtn;
    @FindBy(xpath = "//h1[contains(text(),'Search results')]")
    WebElement _welcomeTextSearchResult;


    public void clickOnSearchLink() {
        clickOnElement(_searchLink);
        log.info("Click on Search Link");
    }

    public void verifySearchPageIsOpen(){
        verifyThatElementIsDisplayed(_closeBtnOfSearchPage);
    }

    public void insertTextInSearchField() {
        sendTextToElement(_searchField, "Syria");
        log.info("Insert Text in Search Field");
    }

    public void clickOnSearchButton() {
        clickOnElement(_searchBtn);
        log.info("Click on Search button");
    }

    public boolean verifySearchResultIsDisplayed() {
        return verifyThatElementIsDisplayed(_welcomeTextSearchResult);
    }
}
