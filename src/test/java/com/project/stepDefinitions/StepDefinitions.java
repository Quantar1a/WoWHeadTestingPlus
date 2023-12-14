package com.project.stepDefinitions;

import com.project.data.Data;
import com.project.steps.Steps;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.Setting;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@LastUpdatePoint("05.12.2023")
public class StepDefinitions
{
    Steps steps;

    @Before
    public void setSteps()
    {
        steps = new Steps();
    }

    @Given("User is on wowhead.com main page")
    public void isOnMainPage()
    {
        Setting.openURL(Data.WOWHEAD_URL);
    }

    @When("User click on {string} in Today_in_WoW element")
    public void selectToken(String realm)
    {
        steps.clickToRealmSwitcher(realm);
    }

    @Then("User see: {string} and token price on {string}")
    public void getTokenPrice(String string, String realm)
    {
        steps.getTokenPrice(string, realm);
    }
}
