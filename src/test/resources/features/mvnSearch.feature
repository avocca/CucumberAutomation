Feature: MVN Repository Search

  @work
  Scenario: Verifying the search result for mvn repository
    Given user is on mvnrepository application
    And user searches for "cucumber" on mvn application
    Then user should see only "cucumber" related results