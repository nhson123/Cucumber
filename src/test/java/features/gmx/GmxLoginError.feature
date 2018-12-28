Feature: GmxLoginErrorFeature
  it will try to log in Gmx with wrong data

  @firefox
  Scenario: Login with wrong login data
    Given i navigate to the Gmx login page
    And i enter following errorUser and  errorPwd
      | errorUser | errorPwd |
      | test      | test     |
      | testUser1 | testPwd1 |

    And i click the Gmx Enter button
    Then i see the alert error login