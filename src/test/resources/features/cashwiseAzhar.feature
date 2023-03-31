Feature: Sign in in CashWise

  @azhar
  Scenario Outline: Verifying user sign in in CashWise
    Given user opens website cashWise
    Given user clicks on sign in button
    When user enters "<email>" and "<password>"  and clicks sign in button
    Then user should land in "<url>"

    Examples:
      | email                   | password |  url  |
      | cashwise@gmail.com      |  123123   | https://cashwise.us/dashboard/infographics |
      | test                     | test1    |  https://cashwise.us/main?login=true |