package uk.co.appearhere.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.appearhere.utility.Util;

public class SignUpPage extends Util {

    private static Logger log = LogManager.getLogger(SignUpPage.class.getName());
    @FindBy(xpath = "//span[contains(text(),'Sign up with Email')]")
    WebElement _signUpWithEmail;
    @FindBy(id = "firstName")
    WebElement _firstNameField;
    @FindBy(id = "lastName")
    WebElement _lastNameField;
    @FindBy(id = "email")
    WebElement _emailField;
    @FindBy(id = "password")
    WebElement _password;
    @FindBy(xpath = "//button[@class='Bloom__root_bg Bloom__widthFull_a5 Bloom__mtr_46 Bloom__primary_bk']")
    WebElement _signUpBtn;
    @FindBy (xpath = "//ul[@class='right']//a[contains(text(),'Dashboard')]")
    WebElement _dashBoard;


    public void clickOnSignUpWithEmailField() {
        clickOnElement(_signUpWithEmail);
        log.info("Click on sign up with email field ");

    }

    public void enterFirstNameInFirstNameField(String firstname) {
        sendTextToElement(_firstNameField, firstname);
        log.info("Enter first name in first name field");

    }

    public void enterLastNameInLastNameField(String lastname) {
        sendTextToElement(_lastNameField, lastname);
        log.info("Enter last name in last name field");
    }

    public void enterEmailInEmailField(String email) {
        sendTextToElement(_emailField, randomString() + generateRandomNumber() + "@gmail.com");
        log.info("Enter email in email field");
    }

    public void enterPassword(String password) {
        sendTextToElement(_password, password);
        log.info("Enter Password in Password field");
    }

    public void clickOnSignUpBtn() {
        clickOnElement(_signUpBtn);
        log.info("Click on sign up button");
    }

    public boolean isDashBoardDisplayed(){
        return verifyThatElementIsDisplayed(_dashBoard);
    }

}
