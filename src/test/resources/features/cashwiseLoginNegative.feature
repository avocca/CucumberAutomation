Feature: Cashwise Login

  @cashwise
  Scenario Outline: Verifying the login with invalid credentials
    Given I am on the Cashwise login page
    And I click on sign in button
    When I logs in "<email>" and "<password>"
    Then I should land on "<url>" page

    Examples:
      | email              | password | url                                     |
      | cashwise@gmail.com | 123123   | https://cashwise.us/main?showLogin=true |
      | hi@test.com        | test     | https://cashwise.us/main?showLogin=true |
      |                    | test     | https://cashwise.us/main?showLogin=true |
      | hi@test.com        |          | https://cashwise.us/main?showLogin=true |


  Scenario Outline: Verifying an error message for negative login
    Given I am on the Cashwise login page
    And I click on sign in button
    When I logs in "<email>" and "<password>"
    Then I should see an error message "<email error message>" and "<password error message>"

    Examples:
      | email          | password | email error message                | password error message                 |
      | test@gmail.com | test     |                                    | Password must be at least 6 characters |
      | test@gmail.com |          |                                    | Password must be at least 6 characters |
      | test           | test123  | Please enter a valid email address |                                        |
      |                | test123  | Please enter a valid email address |                                        |
    