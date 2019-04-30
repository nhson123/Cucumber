@chrome
Feature: Navigate and login in pipe

  Scenario: Login in BausDB
    Given ich navigiere zu BausDB "https://ref-bauservices.wrwks.at/login"
    And ich logge mich als "wrwkshnguyen1" und "xxxx" in Bausdb ein
    Then Login Fehlermeldung ersichtlich
    And ich logge mich als "wrwkshnguyen" und "Start1234$" in Bausdb ein
    Then ich bin auf Personenadmin Seite
  #Then ich bin auf die Seite Arbeitsplatzauswahl
  #And ich wähle den "Backoffice 1" als Raum und "Backoffice 1 / Arbeitsplatz 1" als Platz