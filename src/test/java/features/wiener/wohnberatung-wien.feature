Feature: Wohnberatung HP
  check die PopUps und ToolTipText


  @chrome
  Scenario: wohnberatung-wien hauptseite
    Given ich navigiere zu wohnberatung-wien
    And ich ziehe das Logo zu Login
    And ich lasse die Links checken
    And ich klicke auf wiener Wohn-Ticket
    And ich sehe den Inhalt des Popups
    When ich halte den Cursor über Allgemeines
    Then ich sehe den ToolTipText Allgemeinse
    When ich klicke auf Allgemeines
    Then ich sehe Allgemeinesseite
