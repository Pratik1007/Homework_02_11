Feature: Homepage feature

  As a user i want to verify Homepage features

  Scenario Outline: User Should be able to click on dropdown features on homepage successfully
    Given I am on Homepage of GMx.com
    When I click on dropdown "<category>"
    Then I should be able to navigate to "<category>" page successfully
    Examples:
      | category |
      | Free Email |
      | Features   |
      | Apps       |
