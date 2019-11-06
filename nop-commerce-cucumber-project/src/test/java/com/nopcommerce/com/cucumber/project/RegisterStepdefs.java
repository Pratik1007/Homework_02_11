package com.nopcommerce.com.cucumber.project;

import com.nopcommerce.com.cucumber.project.pages.HomePage;
import com.nopcommerce.com.cucumber.project.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterStepdefs {
    @Given("^I am on home page of Demo-Nop-commerce$")
    public void iAmOnHomePageOfDemoNopCommerce() {
    }

    @And("^I click on ‘Register’ tab and I am in ‘Register’ page$")
    public void iClickOnRegisterTabAndIAmInRegisterPage() {
        new HomePage().clickOnRegisterLink();
    }

    @When("^I select 'Male' radio-button for ‘Gender’$")
    public void iSelectMaleRadioButtonForGender() {
        new RegisterPage().clickOnGender();
    }

    @And("^I enter first name in ‘First name’ field$")
    public void iEnterFirstNameInFirstNameField() {
        new RegisterPage().enterFirstName("John");
    }

    @And("^I enter last name in ‘Last name’ field$")
    public void iEnterLastNameInLastNameField() {
        new RegisterPage().enterLastName("Smith");
    }

    @And("^I select 'Day' of birth form DOB-Day dropped down selection$")
    public void iSelectDayOfBirthFormDOBDayDroppedDownSelection() {
        new RegisterPage().enterDayOfBirth("15");
    }

    @And("^I select 'Month' of birth from DOB-Month dropped down selection$")
    public void iSelectMonthOfBirthFromDOBMonthDroppedDownSelection() {
        new RegisterPage().enterMonthOfBirth("July");
    }

    @And("^I select 'Year' of birth from BOB-Year dropped down selection$")
    public void iSelectYearOfBirthFromBOBYearDroppedDownSelection() {
        new RegisterPage().enterYearOfBirth("2000");
    }

    @And("^I enter valid 'email' in ‘Email-field'$")
    public void iEnterValidEmailInEmailField() {
        new RegisterPage().enterEmail("john.smith@gmail.com");
    }

    @And("^I enter Company details in ‘Company name’ field$")
    public void iEnterCompanyDetailsInCompanyNameField() {
        new RegisterPage().enterCompanyName("ABC Corporation");
    }

    @And("^I enter ‘Password’ in password-field$")
    public void iEnterPasswordInPasswordField() {
        new RegisterPage().enterPassword("john123");
    }

    @And("^I enter 'Password' in Confirm password-field$")
    public void iEnterPasswordInConfirmPasswordField() {
        new RegisterPage().enterPasswordInConfirmPassword("john123");
    }

    @And("^I click on ‘ Register’ tab$")
    public void iClickOnRegisterTab() {
        new RegisterPage().clickOnRegisterBtn();
    }

    @Then("^I should be able to register successfully$")
    public void iShouldBeAbleToRegisterSuccessfully() {
        Assert.assertEquals("Your registration completed", new RegisterPage().welcomeText());
    }
}
