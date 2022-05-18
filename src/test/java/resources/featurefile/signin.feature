Feature: Sign Test
  As User I want to Login into automation Website

  @smoke @sanity @regression
  Scenario: User Should Navigate to Sign in page successfully
    Given I am on homepage
    Then I click on signin link
    Then I should see the AUTHENTICATION message displayed

  @smoke @regression
  Scenario Outline: Verify the error message with Invalid credentials
    Given I am on homepage
    Then I click on signin link
    Then I enter invalid email address "<username>"
    Then I enter password "<password>"
    Then I click on Signin Button
    And I should see an error Message "<errormsg>"
    Examples:
      | username           | password | errormsg                   |
      |                    | 123456   | An email address required. |
      | abcd@gmail.com     |          | Password is required.      |
      | adfdfgfg@gmail.com | 123456   | Invalid email address.     |
      | abcd@gmail.com     | 123456   | Authentication failed.     |

 @regression
Scenario: Verify that user should login successfully with valid credentials
  Given I am on homepage
  Then I click on signin link
  Then  I enter valid email address "nehal137@gmail.com"
  And I enter password "Nehal123!"
  And I click on Signin Button
  And I can see Signout link

@regression
  Scenario: Verify That User Should LogOut SuccessFully
    Given I am on homepage
    Then I click on signin link
    Then  I enter valid email address "nehal137@gmail.com"
    And I enter password "Nehal123!"
    And I click on Signin Button
    And I click on Signout link
    And I can see Signin link