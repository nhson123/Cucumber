Feature: File upload
  upload a file to https://tus.io/demo.html

  @chrome
  Scenario: upload a file from pc to test site
    Given ich navigiere zu tus io
    And ich klicke auf Datei auswählen
    When ich wähle Datei aus und lade hoch
    Then ich sehe die Erfolgmeldung
    When ich clicke auf geladene Datei
    Then ich sehe downloaded datei local
    And ich loesche die Datei
