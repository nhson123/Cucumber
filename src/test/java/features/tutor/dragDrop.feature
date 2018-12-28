Feature: drag and drop of webelement
  http://demo.guru99.com/test/drag_drop.html

  #@chrome
  #@htmlUnitDriver
  #@firefox
  @phantomJs
  Scenario: drag and drop
    Given ich navigiere zu dragDrop seite
    And ich checke die dragDrop seite
    When ich ziehe die Bank zu  debit Acoount
    Then ich ziehe die 5000 zu debit Amount