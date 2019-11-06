package uk.org.redcross.cucumber.project;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.org.redcross.cucumber.project.pages.HomePage;

public class HomepageStepdefs {
    @Given("^I am on Homepage of Red cross$")
    public void iAmOnHomepageOfRedCross() {
    }

    @When("^I click on 'Get help' link$")
    public void iClickOnGetHelpLink() {
        new HomePage().clickOnGetHelpLink();
    }

    @Then("^I should be on 'Get Help' page$")
    public void iShouldBeOnGetHelpPage() {
        Assert.assertEquals("GET HELP", new HomePage().getTextfromGetHelpPage());
    }

    @Given("^I am on home page of Red cross$")
    public void iAmOnHomePageOfRedCross() {
    }

    @When("^I click on 'Get involved' link$")
    public void iClickOnGetInvolvedLink() {
        new HomePage().clickOnGetInvolvedLink();
    }


    @When("^I click on 'First aid' link$")
    public void iClickOnFirstAidLink() {
        new HomePage().clickOnFirstAidLink();
    }

    @Then("^I should be on 'First aid' page$")
    public void iShouldBeOnFirstAidPage() {
        Assert.assertEquals("FIRST AID", new HomePage().getTextFromFirstAidPage());
    }

    @When("^I click on 'About us' link$")
    public void iClickOnAboutUsLink() {
        new HomePage().clickOnAboutUsLink();
    }

    @Then("^I should be on 'About us' page$")
    public void iShouldBeOnAboutUsPage() {
        Assert.assertEquals("ABOUT THE BRITISH RED CROSS", new HomePage().getTextFromAboutUsPage());
    }

    @When("^I click on 'Shop' link$")
    public void iClickOnShopLink() {
        new HomePage().clickOnShopLink();
    }

    @Then("^I should be on 'Shop' page$")
    public void iShouldBeOnShopPage() {
        Assert.assertEquals("CHARITY SHOPS", new HomePage().getTextFromShopPage());
    }

    @Then("^I should be on 'Get involved' page$")
    public void iShouldBeOnGetInvolvedPage() {
        Assert.assertEquals("GET INVOLVED", new HomePage().getTextFromGetInvolvedPage());
    }


}
