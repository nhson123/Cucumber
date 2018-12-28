Feature: Registrierung mit Alert
  ein Alert wird provoziert durch fehlerhafte Registrierung

  @chrome
  Scenario: Alert auf Registrierungsseite
    Given ich navigiere zu Loginseite von Wohnberatung Wien
    When ich klicke auf Registrierung link
    Then ich klicke auf Registrieren Button
    And Alert mit Registrierungsfehlermeldung erscheint

