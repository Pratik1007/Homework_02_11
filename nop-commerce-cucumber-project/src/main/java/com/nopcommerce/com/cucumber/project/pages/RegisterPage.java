package com.nopcommerce.com.cucumber.project.pages;

import com.nopcommerce.com.cucumber.project.browserselector.BrowserSelector;
import com.nopcommerce.com.cucumber.project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class RegisterPage extends Util {

    private static Logger log = LogManager.getLogger(RegisterPage.class.getName());


    By registerLink = By.xpath("//a[@class='ico-register']");
    By registerWelcomeText = By.xpath("//div[@class='page-title']");
    By selectGender = By.xpath("//input[@id='gender-male']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyField = By.id("Company");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerBtn = By.xpath("//input[@id='register-button']");
    By welcometext = By.xpath("//div[text()='Your registration completed']");


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Click on Register Link");
    }

    public String registerText() {
        return getTextFromElement(registerWelcomeText);
    }

    public void clickOnGender() {
        clickOnElement(selectGender);
        log.info("Click on Gender");
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
        log.info("Enter Firstname");
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
        log.info("Enter Lastname");
    }

    public void enterDayOfBirth(String dayofbirth) {
        sendTextToElement(dayOfBirth, dayofbirth);
        log.info("Enter Day of Birth");
    }

    public void enterMonthOfBirth(String monthofbirth) {
        sendTextToElement(monthOfBirth, monthofbirth);
        log.info("Enter Month of Birth");
    }

    public void enterYearOfBirth(String yearofbirth) {
        sendTextToElement(yearOfBirth, yearofbirth);
        log.info("Enter Year of Birth");
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, randomString() + generateRandomNumber() + "@gmail.com");
        log.info("Enter Email");
    }

    public void enterCompanyName(String company) {
        sendTextToElement(companyField, company + randomString()+ "Corporation");
        log.info("Enter Company Name");
    }

    public void enterPassword(String Password) {
        sendTextToElement(password, Password );
        log.info("Enter Password");
    }

    public void enterPasswordInConfirmPassword(String Password) {
        sendTextToElement(confirmPassword, Password );
        log.info("Enter Password To Confirm Password");
    }

    public void clickOnRegisterBtn() {
        clickOnElement(registerBtn);
        log.info("Click On Register Link");
    }

    public String welcomeText() {
        return getTextFromElement(welcometext);
    }

}
