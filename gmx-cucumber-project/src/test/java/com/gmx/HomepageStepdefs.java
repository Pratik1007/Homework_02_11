package com.gmx;

import com.gmx.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageStepdefs {

    @Given("^I am on Homepage of GMx\\.com$")
    public void iAmOnHomepageOfGMxCom() {
        new HomePage().homePageVerification();
    }

    @When("^I click on dropdown \"([^\"]*)\"$")
    public void iClickOnDropdown(String category) {
        if (category.equalsIgnoreCase("free email")) {
            new HomePage().clickOnFreeEmailLink();
        } else if (category.equalsIgnoreCase("features")) {
            new HomePage().clickOnFeaturesLink();
        } else if (category.equalsIgnoreCase("Apps")) {
            new HomePage().clickOnAppsLink();
        }
    }
    @Then("^I should be able to navigate to \"([^\"]*)\" page successfully$")
    public void iShouldBeAbleToNavigateToPageSuccessfully(String category)  {
        if (category.equalsIgnoreCase("free email")) {
            Assert.assertTrue(new HomePage().freeEmailPageVerification());
        } else if (category.equalsIgnoreCase("features")) {
            Assert.assertTrue(new HomePage().featuresPageVerification());
        } else if (category.equalsIgnoreCase("Apps")) {
            Assert.assertTrue(new HomePage().appsPageVerification());
        }
    }
}
