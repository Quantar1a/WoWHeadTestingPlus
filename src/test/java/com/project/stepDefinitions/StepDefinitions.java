package com.project.stepDefinitions;

import com.project.data.Data;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.Setting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@LastUpdatePoint("05.12.2023")
public class StepDefinitions
{
    @Given("User is on wowhead.com main page")
    public void isOnMainPage()
    {
        Setting.openURL(Data.WOWHEAD_URL);
    }

    @When("User click on {string} in Today_in_WoW element")
    public void selectToken(String string)
    {
        System.out.println(string);
    }

    @Then("User see: {string} and its price")
    public void getTokenPrice(String string)
    {
        System.out.println(string);
    }
}
