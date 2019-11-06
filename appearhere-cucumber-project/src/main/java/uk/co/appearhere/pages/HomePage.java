package uk.co.appearhere.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.appearhere.utility.Util;

public class HomePage extends Util {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath = "//button[@class='Bloom__root_bg button signup radius']")
    WebElement _SignUpLink;

    @FindBy (xpath = "//a[contains(text(),'Acceptable use policy')]")
    WebElement _welcomeTextOfSignUpPage;

    public void clickOnSignUpLink(){
        clickOnElement(_SignUpLink);
    }

    public String VerifyWelcomeTextForSignUp(){
return getTextFromElement(_welcomeTextOfSignUpPage);
    }




}
