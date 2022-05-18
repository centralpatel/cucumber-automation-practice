Feature: Women Category Test
  As a user I want to navigate and shop in the women category

  @smoke @sanity @regression
  Scenario: Verify user should navigate to Women Category page successfully
    Given I am on homepage
    When I click on Women tab
    Then I can see the women text

  @smoke @regression
  Scenario Outline: verify User Should Add Product To The Cart Successfully
    Given I am on homepage
    When I click on Women tab
    Then I click on Product "<product>"
    And I change quantity "<quantity>"
    Then I can select size "<size>"
    And I select colour "<colour>"
    And I click on Add to Cart Button
    Then I can see the message "<Product successfully added to your shopping cart>"
    And I click on the X button to close the popup window
    Examples:
      | product                                | quantity | size | colour |
      | Blouse                                 | 2        | M    | White  |
      | Printed Dress                          | 3        | L    | Orange |
      | Printed Chiffon Dress                  | 4        | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2        | M    | Blue   |


