package com.nopcommerce.com.cucumber.project;

import com.nopcommerce.com.cucumber.project.pages.HomePage;
import com.nopcommerce.com.cucumber.project.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {

//    HomePage homePage = new HomePage();
//    LoginPage loginPage = new LoginPage();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should be on login page$")
    public void iShouldBeOnLoginPage() {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().navigateToWelcomePageWelcomeText());
    }

    @And("^I enter email address \"([^\"]*)\" into emailField$")
    public void iEnterEmailAddressIntoEmailField(String email) {
        new LoginPage().enterEmail((email));
    }

    @And("^I enter password \"([^\"]*)\" into passwordField$")
    public void iEnterPasswordIntoPasswordField(String password) {
        new LoginPage().password((password));
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully into my account$")
    public void iShouldLoginSuccessfullyIntoMyAccount() {
        Assert.assertEquals("Welcome to our store", new LoginPage().welcomeText());
    }


    @And("^I enter email address \"([^\"]*)\" into emailField into emailField$")
    public void iEnterEmailAddressIntoEmailFieldIntoEmailField(String email) {
        new LoginPage().enterEmail((email));
    }

    @And("^I enter password \"([^\"]*)\" into passwordField into passwordField$")
    public void iEnterPasswordIntoPasswordFieldIntoPasswordField(String password) {
        new LoginPage().password((password));
    }

    @Then("^I should not login successfully into account$")
    public void iShouldNotLoginSuccessfullyIntoAccount() {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().loginUnsuccessfulErrorMsg());
    }

}
