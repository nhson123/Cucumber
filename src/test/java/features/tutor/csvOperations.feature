Feature: cvsOpesations

  @phantomJs
  Scenario: CSV read and write
    Given ich lese daten aus csvFile
    When ich schreibe daten in csvFile
    Then ich kann die neue Daten in csvFile sehen