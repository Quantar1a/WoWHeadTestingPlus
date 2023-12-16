@UI
@MainPageScenarios
@Affixes

  Feature: Check mythic+ affixes

    This test verify if token price is present on the page, depending on realm.
    According to Test case #mainPage.1

    Scenario Outline: Check mythic+ affixes for "<realm>"
      Given User open page "wowhead.com"
      When User click on the "<realm>" in "Today in WoW" section
      Then User see "MYTHIC+ AFFIXES" and list of affixes on "<realm>"
      Examples:
        | realm |
        | NA    |
        | EU    |