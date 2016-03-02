@Login
  Feature: Login to te System
    TC-123 Login test cases

  Scenario: Test1 - Positive
    Given I navigate to ellos website
    And I click Login link
    When I write email address "alex_ace@ukr.net"
    And I write password "a1989"
    And I click on button login
    Then I see that I am logged in
    And I logged out