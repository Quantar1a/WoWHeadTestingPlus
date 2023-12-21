package com.project.steps;

import com.project.pages.pageObjects.WoWHeadMainPage;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

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

        Allure.step("Check if tokenPrice is displayed");
        Assert.assertTrue(element.isDisplayed());

        Allure.step("Check if 'string' is written correct");
        Assert.assertEquals(woWHeadMainPage.todayInWoWComponent.selectWoWTokenString(realm).getText(), string);

        System.out.println(element.getText());
    }

    public void checkMythicAffixes(String title, String realm)
    {
        Allure.step("Check if title name is written correct");
        Assert.assertEquals(woWHeadMainPage.todayInWoWComponent.getMythicPlusTitleText(realm).getText(), title);

        Allure.step("Check if Mythic+ affixes is presented on page");
        List<WebElement> list = woWHeadMainPage.todayInWoWComponent.getListOfMythicAffixes(realm);

        Assert.assertFalse(list.isEmpty());
        for (WebElement element : list) {
            Assert.assertTrue(element.isDisplayed());
            System.out.println(element.getText());
        }
    }
}
