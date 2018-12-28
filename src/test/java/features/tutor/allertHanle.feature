Feature: handle the alert/popUp
  https://artoftesting.com/sampleSiteForSelenium.html

  @firefox
  Scenario: accept the Popup
    Given ich navigiere zu artoftesting
    And ich sehe doubleclick to generate alert box
    When ich klicke auf alertBoxButton
    Then ich akzeptiere allert
    And ich drag und drop Image