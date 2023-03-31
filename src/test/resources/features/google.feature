@search @smoke @google @regression
Feature: Google search
  #UserStory: CAS-15

@work
  Scenario: Verifying the result for google search
    Given I am on the google page
    When I search for "cucumber"
    Then I should see only "cucumber" related results


    Scenario: Verifying image result
      Given I am on the google page
      When I search for "Kim Taehyung"
      And I click on image option
      Then I should see only "Kim Taehyung" related images

