Feature: Search Feature

  As a user I want to Search successfully

  Scenario: As a user i should navigate to 'Search' page successfully

    Given I am on Homepage of Red-cross
    When I click On Search link
    Then I should navigate to 'Search' page

  Scenario: As a user i should 'Search' successfully
    Given I am on Search page
    And I enter '<Syria>' in Search field
    And I click on Search button
    Then I should See the 'Search Result'successfully on the screen

