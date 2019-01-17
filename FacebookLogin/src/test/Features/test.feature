Feature: Facebook should be logged in.

  Scenario: Facebook page should be logged in with correct credentials.
    Given Valid Email
    And Valid Phone number
    And Valid Password
    When I click on Log In button
    Then I should able to enter into home page