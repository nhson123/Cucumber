@firefox
Feature: Navigate and generate SNM Auswertung Wiener Wohnen

  //TODO: links in properties file ablegen
  Scenario: SNM Auswertung Wiener Wohnen
    Given ich navigiere zu BausDB "https://ref-bauservices.wrwks.at/login"
    And ich logge mich als "wrwkshnguyen" und "Start1234$" in Bausdb ein
    Then ich bin auf Personenadmin Seite
    Given nun navigiere ich zu "https://ref-bauservices.wrwks.at/apartmentdefectnote/evaluation/wwurl"
    Then ich bin auf SNW Auwertung WW Seite