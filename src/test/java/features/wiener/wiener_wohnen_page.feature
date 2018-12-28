Feature: Wiener wohnen hauptseite
  Navigieren zu Wienerwohnen und navigieren Gemeindewohnung



  @firefox
  Scenario: wiener wohnen zur gemeinde wohnung
    Given ich navigiere zu wiener wohnen
    And ich klicke auf InteressentIn
    When ich klicke auf Gemeindewohnung
    And ich klicke auf Wohnberatung Wien
    Then ich sehe Seite von Gemeindewohnung

  @chrome
  Scenario: wiener wohnen zur gemeinde wohnung
   Given ich navigiere zu wiener wohnen
   And ich klicke auf InteressentIn
   When ich klicke auf Gemeindewohnung
   And ich klicke auf Wohnberatung Wien
   Then ich sehe Seite von Gemeindewohnung