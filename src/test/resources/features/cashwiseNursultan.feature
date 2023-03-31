Feature: Sign Up

  @nurs
  Scenario Outline: User signs up with invalid and valid
    Given the user navigates to the CashWise web page
    When the user clicks on the "Sign up" button
    And the user fills out the form with a valid email "<email>", password "<password>", and "<confirmation>">
    And the user fills out personal info: name "<name>", surname "<surname>", name of business "<business_name>", address "<address>", and currency "<currency>"
    And the user clicks the "Sign up" button
    Then the user land on "<url>"

    Examples:
      | email                        | password  | confirmation | name      | surname       | business_name   | address | currency | url                                         |
      | torobaev.nursultan@gmail.com | 123123    | 123123       | Nursultan | Torobaev      | SDET            | Chicago | USD      | https://cash-wise.us/dashboard/infographics |
      | testuser2@test.com           | Test1234@ | 123123       | User2     | Test Business | 456 Park Avenue | Chicago | USD      | https://cash-wise.us/dashboard/infographics |
      | testuser3                    | Test1234# | 1231         | User3     | Test Business | 789 Oak Street  | Chicago | USD      | https://cash-wise.us/dashboard/infographics |