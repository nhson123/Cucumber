Feature: GmxLoginFeature
  This Feature will login in Gmx Email Server

  @firefox
  Scenario: Login with correct name and pwd
    Given i navigate to the Gmx login page

    # one kind to send parameter from feature into step definition
    And i enter "nhs@gmx.at" and "homthu*nguyen1970"

    And i click the Gmx Enter button
    Then i could see the Gmx user form page