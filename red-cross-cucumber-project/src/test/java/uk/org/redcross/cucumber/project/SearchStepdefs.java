package uk.org.redcross.cucumber.project;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.org.redcross.cucumber.project.pages.HomePage;
import uk.org.redcross.cucumber.project.pages.SearchPage;

public class SearchStepdefs {
    @Given("^I am on Homepage of Red-cross$")
    public void iAmOnHomepageOfRedCross() {
    }

    @When("^I click On Search link$")
    public void iClickOnSearchLink() { new SearchPage().clickOnSearchLink();
    }

    @Then("^I should navigate to 'Search' page$")
    public void iShouldNavigateToSearchPage() { new SearchPage().verifySearchPageIsOpen();
    }

    @Given("^I am on Search page$")
    public void iAmOnSearchPage() { new SearchPage().clickOnSearchLink();
    }

    @And("^I enter '<Syria>' in Search field$")
    public void iEnterSyriaInSearchField() { new SearchPage().insertTextInSearchField();
    }

    @And("^I click on Search button$")
    public void iClickOnSearchButton() { new SearchPage().clickOnSearchButton();
    }

    @Then("^I should See the 'Search Result'successfully on the screen$")
    public void iShouldSeeTheSearchResultSuccessfullyOnTheScreen() { new SearchPage().verifySearchResultIsDisplayed();
    }
}
