# new feature
# Tags: optional
@firefox
Feature: Navigate and login in pipe

  Scenario: Login in Pipe
    Given ich navigiere zu "https://test01.wwpipe.at/web-portal/faces/pages/common/portal.xhtml"
    And ich logge mich als "tester" und "immerbesser2" ein
