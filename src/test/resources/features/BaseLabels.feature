Feature: Simple feature

  @math
  @allure.id=12
    #only_for_allure-framework
  @severity=blocker
    #additional_story and feature
  @allure.label.story=New_story
  @allure.label.feature=New_feature
  Scenario: Add a to b (1)
    Given a is 5
    And b is 10
    When I add a to b
    Then result is 15
