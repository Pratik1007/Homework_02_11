package uk.co.appearhere;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.appearhere.pages.HomePage;
import uk.co.appearhere.pages.SignUpPage;

public class SignUpStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I click On 'SignUp' link$")
    public void iClickOnSignUpLink() {
        new HomePage().clickOnSignUpLink();

    }

    @Then("^I should navigate to 'Sign up' page$")
    public void iShouldNavigateToSignUpPage() {
        Assert.assertEquals("Acceptable use policy", new HomePage().VerifyWelcomeTextForSignUp());

    }

    @Given("^I am on 'SignUp' page$")
    public void iAmOnSignUpPage() {
        new HomePage().clickOnSignUpLink();
    }

    @When("^I click on 'SignUp with Email' field$")
    public void iClickOnSignUpWithEmailField() {
        new SignUpPage().clickOnSignUpWithEmailField();

    }

    @And("^I enter 'First Name' in first name field$")
    public void iEnterFirstNameInFirstNameField() {
        new SignUpPage().enterFirstNameInFirstNameField("John");
    }

    @And("^I enter 'Last Name' in last name field$")
    public void iEnterLastNameInLastNameField() {
        new SignUpPage().enterLastNameInLastNameField("Smith");
    }

    @And("^I enter 'email' in email field$")
    public void iEnterEmailInEmailField() {
        new SignUpPage().enterEmailInEmailField("john.smith@gmail.com");
    }

    @And("^I enter 'password' in password field$")
    public void iEnterPasswordInPasswordField() {
        new  SignUpPage().enterPassword("john1234");
    }

    @And("^I click on 'Sign Up' button$")
    public void iClickOnSignUpButton() {
        new SignUpPage().clickOnSignUpBtn();
    }

    @Then("^I should Signup successfully and i should see dashboard$")
    public void iShouldSignupSuccessfullyAndIShouldSeeDashboard() {
        Assert.assertTrue(new SignUpPage().isDashBoardDisplayed());
    }
}
