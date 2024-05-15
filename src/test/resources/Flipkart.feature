Feature: To validate purchase module in flipkart

  Scenario: To validate add to cart and remove from cart of Sony camera products
    Given To lanuch flipkart in chrome browser and search product
    And To select product and add into the cart
    And To place order and login into flipkart application
    And To select the deliver address and doing payment
    Then To close the chrome browser
