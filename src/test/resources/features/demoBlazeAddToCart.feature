Feature: Adding products to Cart

  @blazeCart
  Scenario Outline: User should be able to add products to my cart, and purchase it
    Given user is on demo blaze application
    And user clicks on the product "<product>"
    When user clicks add to cart button
    Then user should see "Product added" alert message and clicks Ok
    And user clicks on Cart button
    Then user verifies the details of the added product

    Examples:
      | product           |
      | Iphone 6 32gb     |
      | Samsung galaxy s7 |
      | Sony vaio i7      |