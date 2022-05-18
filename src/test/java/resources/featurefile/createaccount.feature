Feature: Create Account Test
  As user I want to create an account in automation website

  @smoke @sanity @regression
  Scenario: Verify that user should create account successfully
    Given I am on homepage
    When I click on signin link
    Then I enter email address "nehal@gmail.com"
    And I click on create and account button
    Then I fill out all mandetory fields "Nehal", "Patel", "Nehal123!", "Nehal", "Patel", "5 Buckingham Court Road", "Miami", "Florida", "33101", "07854036589", "Home Address"
    And I click on Register
    And I should see "MY ACCOUNT"
