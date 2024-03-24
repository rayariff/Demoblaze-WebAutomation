Feature: Product page feature

  Scenario: Verify that product image is displayed correctly on product page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    And Product image should be displayed correctly

  Scenario: Verify that product name is displayed correctly on product page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    And Product name should be displayed correctly

  Scenario: Verify that product price is displayed correctly on product page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    And Product price should be displayed correctly

  Scenario: Test add to cart functionality when user is logged in
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    And Product image should be displayed correctly
    And Product name should be displayed correctly
    And Product price should be displayed correctly
    And Product description should be displayed correctly
    When User click on add to cart button
    Then Pop up "Product added." will be shown

  Scenario: Test add to cart functionality when user is not logged in
    Given User already on home page
    When User click on one of the product card
    Then User will be redirected to product page
    And Product image should be displayed correctly
    And Product name should be displayed correctly
    And Product price should be displayed correctly
    And Product description should be displayed correctly
    When User click on add to cart button
    Then Pop up "Product added" shouldn't appears