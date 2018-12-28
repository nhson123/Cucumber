Feature: check data of excel

  @phantomJs
  Scenario Outline: excel
    Given ich lese daten eines excelFile
    When ich schreibe eine neue zeile
    And ich schreibe <Vorname> und <Nachname> und <Geb>
    And ich kann die neue Daten sehen
    Examples:
      | Vorname   | Nachname | Geb        |
      | Hoang Nam | Nguyen   | 21.12.2017 |