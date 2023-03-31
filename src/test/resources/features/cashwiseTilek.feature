Feature:CashWise


  @tilek
  Scenario Outline: Verifying login with valid credentials
    Given user is on cashwise application and logins with proper "<email>" and "<password>"
    When user logs in he lands on "<url>" page
    Then user clicks on Sales button and choose ProductAndServices
    And adds new product with following info "<name>" and "<price>" and "<title>" and "<descriptionForCategory>" and "<descriptionMain>"
    Then user edit newly added product "<newname>"




    Examples:
      | email                 | password | url                                        | name        | price | title             | descriptionForCategory    | descriptionMain       | newname   |
      | yyerkanatov@gmail.com | qwerty79 | https://cashwise.us/dashboard/infographics | Los Blancos | 1902  | Santiago Bernabeu | Hasta El Final,Vamos Real | Como No Te Voy Querer | SIIIUUUUU |
