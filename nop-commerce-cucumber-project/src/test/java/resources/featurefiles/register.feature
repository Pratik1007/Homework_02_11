Feature: Nop Commerce Demo end to end Register feature

  As a user I want to register on nopCommerce

  Scenario: User should be able to Register with right credentials Successfully
    Given I am on home page of Demo-Nop-commerce
    And I click on ‘Register’ tab and I am in ‘Register’ page
    When I select 'Male' radio-button for ‘Gender’
    And I enter first name in ‘First name’ field
    And I enter last name in ‘Last name’ field
    And I select 'Day' of birth form DOB-Day dropped down selection
    And I select 'Month' of birth from DOB-Month dropped down selection
    And I select 'Year' of birth from BOB-Year dropped down selection
    And I enter valid 'email' in ‘Email-field'
    And I enter Company details in ‘Company name’ field
    And I enter ‘Password’ in password-field
    And I enter 'Password' in Confirm password-field
    And I click on ‘ Register’ tab
    Then I should be able to register successfully