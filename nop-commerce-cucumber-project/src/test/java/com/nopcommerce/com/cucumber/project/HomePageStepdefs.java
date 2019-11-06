package com.nopcommerce.com.cucumber.project;

import com.nopcommerce.com.cucumber.project.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepdefs {
    @Given("^I am on home page of DemoNopCommerce$")
    public void iAmOnHomePageOfDemoNopCommerce() {
    }

    @When("^I click on 'Computers' link$")
    public void iClickOnComputersLink() {
        new HomePage().clickOnComputersLink();
    }

    @Then("^I should be on 'Computers' page$")
    public void iShouldBeOnComputersPage() {
        Assert.assertEquals("Computers", new HomePage().computersText());
    }

    @When("^I click on 'Electronics' link$")
    public void iClickOnElectronicsLink() {
        new HomePage().clickOnElectronicsLink();
    }

    @Then("^I should be on 'Electronics' page$")
    public void iShouldBeOnElectronicsPage() {
        Assert.assertEquals("Electronics", new HomePage().electronicsText());
    }

    @When("^I click on 'Apparel' link$")
    public void iClickOnApparelLink() {
        new HomePage().clickOnApparelLink();
    }

    @Then("^I should be on 'Apparel' page$")
    public void iShouldBeOnApparelPage() {
        Assert.assertEquals("Apparel", new HomePage().apparelText());
    }

    @When("^I click on 'Digital-Downlaods' link$")
    public void iClickOnDigitalDownlaodsLink() {
        new HomePage().clickOnDigitalDownloadsLink();
    }

    @Then("^I should be on 'Digital-Downloads' page$")
    public void iShouldBeOnDigitalDownloadsPage() {
        Assert.assertEquals("Digital downloads", new HomePage().digitalDownloadText());
    }

    @When("^I click on 'Books' link$")
    public void iClickOnBooksLink() {
        new HomePage().clickOnBooksLink();
    }

    @Then("^I should be on 'Books' page$")
    public void iShouldBeOnBooksPage() {
        Assert.assertEquals("Books",new HomePage().booksText());
    }

    @When("^I click on 'Jewelry' link$")
    public void iClickOnJewelryLink() {
        new HomePage().clickOnJewelryLink();
    }

    @Then("^I should be on 'Jewelry' page$")
    public void iShouldBeOnJewelryPage() {
        Assert.assertEquals("Jewelry", new HomePage().jewelryText());
    }

    @When("^I click on 'GiftCards' link$")
    public void iClickOnGiftCardsLink() {
        new HomePage().clickOnGiftCardsLink();
    }

    @Then("^I should be on 'GiftCards' page$")
    public void iShouldBeOnGiftCardsPage() {
        Assert.assertEquals("Gift Cards", new HomePage().giftCardsText());

    }
}
