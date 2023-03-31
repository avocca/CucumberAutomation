Feature: Cashwise categories in dropdown menu bar

  #User Story: CAS-36

  @aigerim
  Scenario: All categories dropdown verification
    Given user in cashswise page
    When user logs in "email" and "password"
    And user clicks reports menu bar
    Then user should click all categories dropdown menu and able to see the list of available categories