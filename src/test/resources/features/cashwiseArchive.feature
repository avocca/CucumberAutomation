Feature: Cashwise Archive

  @zhamal
  Scenario: User should be able to archive clients from active section
    Given user logs in to the Cashwise main page
    And user clicks on Sales sidebar and clicks on Clients button
    When user clicks on the Archive icon on the left side of the table
    Then user refreshes the page and clicks on Archived section
    Then user should see client was archived

    @zhamal
    Scenario: User should see a white blank page after clicking on archive button
      Given user logs in to the Cashwise main page
      And user clicks on Sales sidebar and clicks on Clients button
      When user clicks on the Archive icon on the left side of the table
      Then user should see a white blank page



