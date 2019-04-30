@chrome
Feature: Check web elements auf Personenadmin Seite

  Scenario: Personenadmin Seite
    Given ich navigiere zu BausDB "https://ref-bauservices.wrwks.at/login"
    And ich logge mich als "wrwkshnguyen" und "Start1234$" in Bausdb ein
    Then ich bin auf Personenadmin Seite
    And ich sehe sämtliche Webelement auf PersonenadminSeite