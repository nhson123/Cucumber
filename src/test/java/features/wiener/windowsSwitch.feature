Feature: switch between windows

  @chrome
  Scenario: from Gmeinde to Wohnberatun and back
    Given ich navigiere zu wiener wohnen
    And ich klicke auf InteressentIn
    And ich klicke auf Wohnberatung Wien
    Then ich sehe Seite von Gemeindewohnung
    And ich switch zu parent seite
