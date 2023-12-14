package com.project.steps;

import com.project.pages.pageObjects.WoWHeadMainPage;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Steps
{
    private WoWHeadMainPage woWHeadMainPage;

    public Steps()
    {
        woWHeadMainPage = new WoWHeadMainPage();
    }

    public void clickToRealmSwitcher(String realm)
    {
        woWHeadMainPage.todayInWoWComponent.selectSpecificRealm(realm).click();
    }

    public void getTokenPrice(String string, String realm)
    {
        WebElement element = woWHeadMainPage.todayInWoWComponent.getTokenPrice(realm);

        Allure.step("check if tokenPrice is displayed");
        Assert.assertTrue(element.isDisplayed());

        Allure.step("check if 'string' is written correct");
        Assert.assertEquals(woWHeadMainPage.todayInWoWComponent.selectString(realm).getText(), string);

        System.out.println(element.getText());
    }
}
