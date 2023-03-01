Feature: To check End to End functionality

  @Regression
  Scenario:USer should place order successfully
    Given User is on the homepage
    When User enter Username to Userfield
    And User enter Password to passwordfield
    And User click on the login button
    Then User should navigate to the products page
#@Regression
#  Scenario:USer should place order successfully
#    Given User is on the product page
    When User click on product "Sauce Labs Backpack"
    And User navigate to Sauce Labs Backpack product page
    And User click on ADD TO CART button
    And User click on shopping cart icon
    And User should see product sauce Labs Backpack added to the cart
    And User click on CHECKOUT button
    And User should navigate to CHECKOUT page and see checkout information
    And User enter firstname to firstname field
    And User enter lastname to lastname field
    And User enter Zip/postal code to zip/postal field
    And User click on continue button
    And User navigate to CHECKOUT steps two page
    And User can see payment information
    And User click on FINISH button
    Then User should naviagate to checkout complete page and can see Thank you for your order message





