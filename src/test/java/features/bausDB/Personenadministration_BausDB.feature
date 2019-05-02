@chrome
Feature: Check web elements auf Personenadmin Seite
 -- https://de.switch-case.com/53921689--
  -- https://www.guru99.com/handling-dynamic-selenium-webdriver.html --

  Scenario: Personenadmin Seite
    Given ich navigiere zu BausDB "https://ref-bauservices.wrwks.at/login"
    And ich logge mich als "wrwkshnguyen" und "Start1234$" in Bausdb ein
    Then ich bin auf Personenadmin Seite
    And ich sehe sämtliche Webelement auf PersonenadminSeite