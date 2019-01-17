Feature: Login Feature Testing
  Scenario: Verify Login Page

    Given I am existing User
     When I enter Valid User Name and PassWord
      And I click submit
    Then I should enter into HomePage.

