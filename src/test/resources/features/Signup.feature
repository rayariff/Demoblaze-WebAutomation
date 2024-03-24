Feature: Sign up feature

  Scenario: Sign up user with valid input data
    Given User already on home page
    When User click sign up in navigation
    And User input "sofieeeee1212" as username in sign up page
    And User input "rehan" as password in sign up page
    And User click sign up button
    Then Pop up "Sign up successful." will be shown

  Scenario: Sign up user with username that has been used
    Given User already on home page
    When User click sign up in navigation
    And User input "sofieee" as username in sign up page
    And User input "rehan" as password in sign up page
    And User click sign up button
    Then Pop up "This user already exist." will be shown

  Scenario: Sign up user with empty username field
    Given User already on home page
    When User click sign up in navigation
    And User input "" as username in sign up page
    And User input "rehan" as password in sign up page
    And User click sign up button
    Then Pop up "Please fill out Username and Password." will be shown

  Scenario: Sign up user with empty password field
    Given User already on home page
    When User click sign up in navigation
    And User input "sofieee" as username in sign up page
    And User input "" as password in sign up page
    And User click sign up button
    Then Pop up "Please fill out Username and Password." will be shown

  Scenario: Sign up user with all empty field
    Given User already on home page
    When User click sign up in navigation
    And User input "" as username in sign up page
    And User input "" as password in sign up page
    And User click sign up button
    Then Pop up "Please fill out Username and Password." will be shown
