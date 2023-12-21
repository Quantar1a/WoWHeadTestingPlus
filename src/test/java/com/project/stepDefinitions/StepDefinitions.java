package com.project.stepDefinitions;

import com.project.data.Data;
import com.project.steps.Steps;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.Setting;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@LastUpdatePoint("21.12.2023")
public class StepDefinitions
{
    Steps steps;

    @Before
    public void setSteps()
    {
        steps = new Steps();
    }

    @Given("User open page \"wowhead.com\"")
    public void isOnMainPage()
    {
        Setting.openURL(Data.WOWHEAD_URL);
    }

    @When("User click on the {string} in \"Today in WoW\" section")
    public void selectToken(String realm)
    {
        steps.clickToRealmSwitcher(realm);
    }

    @Then("User see: {string} and token price on {string}")
    public void getTokenPrice(String string, String realm)
    {
        steps.getTokenPrice(string, realm);
    }

    @Then("User see {string} and list of affixes on {string}")
    public void checkMythicAffixes(String title, String realm)
    {
        steps.checkMythicAffixes(title, realm);
    }

    @And("User find {string} and its list")
    public void findDFWorldBoss(String title)
    {
        steps.findDFWorldBossSection(title);
    }

    @And("User click on first boss name {string}")
    public void userClickOnTheBossName(String realm)
    {
        steps.clickToFirstBossName(realm);
    }

    @And("New page about this boss is opened. User see name, spawn location, quick facts section")
    public void checkWhatUserSee()
    {
        steps.bossPageIsOpened();
    }

}
