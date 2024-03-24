Feature: Cart page feature

  Scenario: Verify that product image is displayed correctly on cart page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    And Product image should be displayed correctly on cart

  Scenario: Verify that product title is displayed correctly on cart page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    And Product title should be displayed correctly on cart

  Scenario: Verify that product price is displayed correctly on cart page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    And Product price should be displayed correctly on cart

  Scenario: Verify that the total price matches the sum of individual product prices displayed in the cart
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    And Product total price should be displayed correctly on cart

  Scenario: Test delete functionality for product on cart page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click delete button on product

  Scenario: Test place order functionality with valid input data when user is already logged in
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "sofia" as name
    And User input "indonesia" as country
    And User input "malang" as city
    And User input "12345" as credit card
    And User input "january" as month
    And User input "2024" as year
    And User click on purchase button
    Then Thank you message for purchasing will showing

  Scenario: Test place order functionality with valid input data when user is not logged in
    Given User already on home page
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added" will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "sofia" as name
    And User input "indonesia" as country
    And User input "malang" as city
    And User input "12345" as credit card
    And User input "january" as month
    And User input "2024" as year
    And User click on purchase button
    Then Thank you message for purchasing shouldn't be showing

  Scenario: Test place order functionality with empty name field
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "" as name
    And User input "indonesia" as country
    And User input "malang" as city
    And User input "12345" as credit card
    And User input "january" as month
    And User input "2024" as year
    And User click on purchase button
    Then Pop up "Please fill out Name and Creditcard." will be shown

  Scenario: Test place order functionality with empty country field
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "Sofia" as name
    And User input "" as country
    And User input "malang" as city
    And User input "12345" as credit card
    And User input "january" as month
    And User input "2024" as year
    And User click on purchase button
    Then Thank you message for purchasing shouldn't be showing

  Scenario: Test place order functionality with empty city field
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "Sofia" as name
    And User input "indonesia" as country
    And User input "" as city
    And User input "12345" as credit card
    And User input "january" as month
    And User input "2024" as year
    And User click on purchase button
    Then Thank you message for purchasing shouldn't be showing

  Scenario: Test place order functionality with input credit card using other than number
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "Sofia" as name
    And User input "indonesia" as country
    And User input "malang" as city
    And User input "adsad" as credit card
    And User input "january" as month
    And User input "2024" as year
    And User click on purchase button
    Then Thank you message for purchasing shouldn't be showing

  Scenario: Test place order functionality with empty credit card field
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "sofia" as name
    And User input "indonesia" as country
    And User input "malang" as city
    And User input "" as credit card
    And User input "january" as month
    And User input "2024" as year
    And User click on purchase button
    Then Pop up "Please fill out Name and Creditcard." will be shown

  Scenario: Test place order functionality with empty month field
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "Sofia" as name
    And User input "indonesia" as country
    And User input "malang" as city
    And User input "12345" as credit card
    And User input "" as month
    And User input "2024" as year
    And User click on purchase button
    Then Thank you message for purchasing shouldn't be showing

  Scenario: Test place order functionality with empty month field
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page
    When User click on add to cart button
    Then Pop up "Product added." will be shown
    When User click on cart navigation
    Then User should be redirected to cart page
    When User click on place order button
    And User input "Sofia" as name
    And User input "indonesia" as country
    And User input "malang" as city
    And User input "12345" as credit card
    And User input "january" as month
    And User input "" as year
    And User click on purchase button
    Then Thank you message for purchasing shouldn't be showing