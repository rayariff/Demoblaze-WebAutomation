Feature: Log in feature

  Scenario: Login user with valid credentials
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "123456" as password in login page
    And User click login button
    Then Welcome user in navigation is shown

  Scenario: Login user with unregistered credentials
    Given User already on home page
    When User click login in navigation
    And User input "sadasfasf" as username in login page
    And User input "asfasd" as password in login page
    And User click login button
    Then Pop up "User does not exist." will be shown

  Scenario: Login user with invalid password
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "asfasd" as password in login page
    And User click login button
    Then Pop up "Wrong password." will be shown

  Scenario: Login user with empty username field
    Given User already on home page
    When User click login in navigation
    And User input "" as username in login page
    And User input "asfasd" as password in login page
    And User click login button
    Then Pop up "Please fill out Username and Password." will be shown

  Scenario: Login user with empty password field
    Given User already on home page
    When User click login in navigation
    And User input "rayariff" as username in login page
    And User input "" as password in login page
    And User click login button
    Then Pop up "Please fill out Username and Password." will be shown

  Scenario: Login user with all of the field is empty
    Given User already on home page
    When User click login in navigation
    And User input "" as username in login page
    And User input "" as password in login page
    And User click login button
    Then Pop up "Please fill out Username and Password." will be shown