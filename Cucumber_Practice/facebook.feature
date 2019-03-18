
Feature: Login

  Scenario: Facebook login
    Given i open a browser
    When i navigate to facebook
    And i put username as "email"
    And i put password as "blah"
    And i click on login
    Then i close the browser

 