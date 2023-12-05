@UI

  Feature: Obtain token price

    Scenario Outline: Obtain token price for "<realm>"
      Given User is on wowhead.com main page
      When User click on "<realm>" in Today_in_WoW element
      Then User see: "WOW TOKEN" and its price

      Examples:
        | realm |
        | NA    |
        | EU    |