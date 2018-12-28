Feature: LoginFeature
  comment blabla

  Scenario: Login with DataTable
    Given i navigate to the login page
    And enter the username and pwd
      | username | pwd     |
      | Son      | nguyen  |
      | Son1     | nguyen1 |
    And i click the Enter button
    Then i could see the user form page

  #Massentest
  @First
  Scenario Outline: Login with correct user name and pwd Outline
    Given i navigate to the login page
    And i enter the <username> and <pwd>
    And i click the Enter button
    Then i could see the user form page
    Examples:
      | username | pwd     |
      | Son      | nguyen  |
      | Son1     | nguyen1 |
      | Son2     | nguyen2 |
      | Son3     | nguyen3 |