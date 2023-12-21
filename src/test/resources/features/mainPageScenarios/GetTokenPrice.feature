@UI
@MainPageScenarios
@TokenPrice

  Feature: Obtain token price

    This test verify if token price is present on the page, depending on realm.

    Scenario Outline: Obtain token price for "<realm>"
      Given User open page "wowhead.com"
      When User click on the "<realm>" in "Today in WoW" section
      Then User see: "WOW TOKEN" and token price on "<realm>"

      Examples:
        | realm |
        | NA    |
        | EU    |