@UI
@MainPageScenarios

  Feature: Obtain token price

    This test verify if token price is present on the page, depending on realm.

    Scenario Outline: Obtain token price for "<realm>"
      Given User is on wowhead.com main page
      When User click on "<realm>" in Today_in_WoW element
      Then User see: "WOW TOKEN" and token price on "<realm>"

      Examples:
        | realm |
        | NA    |
        | EU    |