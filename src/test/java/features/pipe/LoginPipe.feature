# new feature
# Tags: optional
@chrome
Feature: Navigate and login in pipe

  Scenario: Login in Pipe
    Given ich navigiere zu "https://stage.wwpipe.at/web-portal/faces/pages/common/portal.xhtml"
    And ich logge mich als "tester" und "immerbesser2" ein
   And ich check die aktuelle Seite und leiet eventuell die Platzauswahl ein
  #Then ich bin auf die Seite Arbeitsplatzauswahl
  #And ich wähle den "Backoffice 1" als Raum und "Backoffice 1 / Arbeitsplatz 1" als Platz
