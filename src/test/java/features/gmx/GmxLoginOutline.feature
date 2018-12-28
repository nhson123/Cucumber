Feature: GmxLoginOutlineFeature
  Login with correct data by Outline

  @firefox
  Scenario Outline: Login with correct data by examples
    #use a apart of existing GmxLoginStep
    Given i navigate to the Gmx login page
    And i enter to outline the  <username> and <password>
    And i enter from outline the <Username> and <Password> and <Case>
    # And i enter the "Username" and "Password" and "Case "
    # use the a part of existing GmxLoginStep
    And i enter the contact email: name
    And i enter the alternative email secondName
    And i click the Gmx Enter button
    When the Gmx site is opened
    Then i see the alert error login
      # Then i could see the Gmx user form page
    Examples:
      | username | password |
      | test     | test     |
      | test1    | test1    |
      | test2    | test2    |
    Examples:
      | Username | Password | Case |
      | test     | test     | true |
      | testa    | testa     | false |