@UI
@MainPageScenarios
@ListOfWorldBoss

  Feature: Check list of world boss

    This test verify if list of world boss is present on the page, depending on realm.
    According to Test case #mainPage.6

  Scenario Outline:
    Given User open page "wowhead.com"
    When User click on the "<realm>" in "Today in WoW" section
    And User find "DF WORLD BOSS" and its list
    And User click on first boss name "<realm>"
    Then New page about this boss is opened. User see name, spawn location, quick facts section


    Examples:
      | realm |
      | NA    |
      | EU    |