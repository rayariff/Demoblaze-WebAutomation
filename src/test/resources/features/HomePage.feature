Feature: Home page feature

  Scenario: Verify carousel image is displayed on homepage
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    And User verify that carousel image is loaded correctly

  Scenario: Verify that next button beside carousel is active
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    And User verify that carousel image is loaded correctly
    When User click next button beside carousel
    Then Carousel image will be changed to next image

  Scenario: Verify that previous button beside carousel is active
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    And User verify that carousel image is loaded correctly
    When User click previous button beside carousel
    Then Carousel image will be changed to previous image

  Scenario: Verify that choosing of the categories will display relevant products
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click Phone categories
    Then Displayed product is relevant to Phone categories


  Scenario: Verify that the product card displays the image, name, price, and description of product correctly
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    And Product image is shown correctly
    And Product name is shown correctly
    And Product price is shown correctly
    And Product description is shown correctly

  Scenario: Test that clicking on product card will redirects the user to the product page
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on one of the product card
    Then User will be redirected to product page

  Scenario: Test that clicking on the next button shows the next products
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on next product button
    Then Next product should be displayed

  Scenario: Test that clicking on the previous button shows the next products
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click on previous product button
    Then Previous product should be displayed

  Scenario: Verify that clicking on the next button only shows relevant products when a category is chosen
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click Phone categories
    And User click on next product button
    Then Product should be only show relevant product in phone categories

  Scenario: Verify that clicking on the next button only shows relevant products when a category is chosen
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown
    When User click monitor categories
    And User click on previous product button
    Then Product should be only show relevant product in monitor categories