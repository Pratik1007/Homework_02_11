Feature: Nop Commerce Demo Login feature

  As a user I want to login into nop commerce website

  Scenario: User should navigate to Login page successfully
    Given I am on home page
    When I click on login link
    Then I should be on login page
#@Sanity
  Scenario: User should login successfully
    Given I am on home page
    When I click on login link
    And I enter email address "abc123@gmail.com" into emailField
    And I enter password "abc123" into passwordField
    And I click on Login button
    Then I should login successfully into my account

  Scenario Outline: User should not login with invalid credentials
    Given I am on home page
    When I click on login link
    And I enter email address "<email>" into emailField into emailField
    And I enter password "<password>" into passwordField into passwordField
    And I click on Login button
    Then I should not login successfully into account

    Examples:
      | email              | password |
      | bcde@gmail.com     | abc12354 |
      | xyz1234@gmail.com  | ab123544 |
      | pqrst123@gmail.com | xy123145 |