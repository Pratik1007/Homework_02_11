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

public class LoginPage extends Util {

    private static Logger log = LogManager.getLogger(LoginPage.class.getName());

//    By emailField = By.id("Email");
//    By passwordField = By.id("Password");
//    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
//    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    @FindBy (xpath = "//input[@id='Email']")
    WebElement _emailField;
    @FindBy (id = "Password")
    WebElement _passwordField;
    @FindBy (xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;
    @FindBy (xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;

    /*method for sending email to emailfield*/

    public void enterEmail(String email) {
        log.info("Enter email address");
        sendTextToElement(_emailField, email);
    }

    /*method for sending password to password field*/

    public void password(String password) {
        log.info("Enter password in password field");
        sendTextToElement(_passwordField, password);
    }

    /*method for click login button*/

    public void clickOnLoginButton() {
        log.info("Click on login button");
        clickOnElement(_loginBtn);
    }

    /*method to get welcome text*/

    public String welcomeText() {

        log.info("Verify wecome text");
        return getTextFromElement(_welcomeText);
    }
}