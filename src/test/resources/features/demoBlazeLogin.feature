Feature: Demo Blaze Login

  @bts
  Scenario: Verifying the login functionality positive
    Given user is on demo blaze application
    And user clicks on login button for demo blaze
    When user enters credentials "test" and "test" and clicks login
    Then user should successfully login