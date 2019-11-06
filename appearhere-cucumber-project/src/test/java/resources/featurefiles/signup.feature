Feature: SignUp Feature

  As a user I want to Sign Up successfully

  Scenario: As a user i should navigate to Sign Up page sucessfully
    Given I am on homepage
    When I click On 'SignUp' link
    Then I should navigate to 'Sign up' page

  Scenario: As a user i should SignUp successfully
    Given I am on 'SignUp' page
    When I click on 'SignUp with Email' field
    And I enter 'First Name' in first name field
    And I enter 'Last Name' in last name field
    And I enter 'email' in email field
    And I enter 'password' in password field
    And I click on 'Sign Up' button
    Then I should Signup successfully and i should see dashboard

