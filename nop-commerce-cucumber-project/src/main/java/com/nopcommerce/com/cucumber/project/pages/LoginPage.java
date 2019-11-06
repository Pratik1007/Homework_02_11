package com.nopcommerce.com.cucumber.project.pages;

import com.nopcommerce.com.cucumber.project.browserselector.BrowserSelector;
import com.nopcommerce.com.cucumber.project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends Util {

    private static Logger log = LogManager.getLogger(LoginPage.class.getName());


    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By errorMsg = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By welcomeLoginPageText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    /*method for sending email to emailfield*/

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter Email");
    }

    /*method for sending password to password field*/

    public void password(String password) {
        sendTextToElement(passwordField,password);
        log.info("Password");
    }

    /*method for click login button*/

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
        log.info("Click On Login Button");
    }

    /*method to get welcome text*/

    public String welcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String loginUnsuccessfulErrorMsg(){
        return getTextFromElement(errorMsg);
    }

    public String navigateToWelcomePageWelcomeText(){
        return getTextFromElement(welcomeLoginPageText);
    }
}
