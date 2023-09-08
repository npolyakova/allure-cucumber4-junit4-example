Feature: Test Scenarios with backgrounds

  Background:
    Given it's cold

    # use allure.properties to set link patterns
  @issue=61
  @link.myLink=thecatsite.com
  @tmsLink=12
  Scenario: Scenario with background
    When a window is opened
    Then close the window
