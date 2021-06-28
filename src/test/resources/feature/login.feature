Feature: Feature To Test Login Functionality


  Scenario: check login with successful cred
    
    Given User on login page
    When User enter valid credential
    And Click on login
    Then user is successfully logged into homepage
    
 
