package com.project.steps;

import com.project.pages.pageObjects.WoWHeadMainPage;
import com.project.pages.pageObjects.WorldBossPage;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.Setting;
import io.qameta.allure.Allure;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

@LastUpdatePoint("21.12.23")
public class Steps
{
    private String currentRealm;
    private WoWHeadMainPage woWHeadMainPage;
    private WorldBossPage worldBossPage;
    private WebDriverWait wait;

    public Steps()
    {
        woWHeadMainPage = new WoWHeadMainPage();
        worldBossPage = new WorldBossPage();

    }

    public void clickToRealmSwitcher(String realm)
    {
        currentRealm = realm;
        woWHeadMainPage.todayInWoWComponent.selectSpecificRealm(currentRealm).click();
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

    public void findDFWorldBossSection(String title)
    {
        Allure.step("Check if " + title + " is displayed");
        Assert.assertTrue(woWHeadMainPage.todayInWoWComponent.getWorldBossTitle(currentRealm).isDisplayed());
        Assert.assertEquals(woWHeadMainPage.todayInWoWComponent.getWorldBossTitle(currentRealm).getText(), title);

        Allure.step("Check if world boss list is displayed, and contains elements");
        List<WebElement> worldBossList = woWHeadMainPage.todayInWoWComponent.getWorldBossList(currentRealm);
        Assert.assertFalse(worldBossList.isEmpty());
        for (WebElement boss : worldBossList) {
            Assert.assertTrue(boss.isDisplayed());
        }

    }

    public void clickToFirstBossName(String realm)
    {
        woWHeadMainPage.todayInWoWComponent.clickToFirstBossInList(currentRealm);
    }

    public void bossPageIsOpened()
    {

        Allure.step("Check if spawn map is displayed");
        Assert.assertTrue(worldBossPage.isSpawnMapDisplayed());

        Allure.step("Check if boss name is displayed");
        Assert.assertTrue(worldBossPage.isBossNameDisplayed());

        Allure.step("Check if quick facts is displayed");
        List<WebElement> quickFacts = worldBossPage.getQuickFacts();
        for (WebElement element: quickFacts) {
            Assert.assertTrue(element.isDisplayed());
        }
    }
}
