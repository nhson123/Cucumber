Feature: MultiSzenariosFeature

  Scenario: LogInGoogle
    Given i navigate to GoogleStartPage
    And i enter my username and password
    And i enter my email as Email: admin
   # And i check my salary id digit
    And i click the Login button
    Then i see my GooglePage

  Scenario: LogOutGoogle
    Given i am on my GooglePage
    And i click the Logout button
    Then i see GoogleStartPage

  Scenario: quitPage
    Given i navigate to GoogleStartPage
    And i click the close button
    Then window closes