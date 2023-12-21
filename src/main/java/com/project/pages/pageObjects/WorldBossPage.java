package com.project.pages.pageObjects;

import com.project.pages.AbstractLocators;
import com.project.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WorldBossPage extends AbstractPage
{
    private Locators locators;
    private WebDriverWait webDriverWait;

    public WorldBossPage()
    {
        locators = new Locators(webDriver);
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(60));
    }

    public boolean isBossNameDisplayed()
    {
        return locators.name.isDisplayed();
    }

    public boolean isSpawnMapDisplayed()
    {
        webDriverWait.until(ExpectedConditions.visibilityOf(locators.spawnMap));
        return locators.spawnMap.isDisplayed();
    }

    public List<WebElement> getQuickFacts()
    {
        return locators.quickFacts;
    }


    private class Locators extends AbstractLocators
    {
        protected Locators(WebDriver driver)
        {
            super(driver);
        }

        @FindBy(xpath = "//ul[@class='first last']")
        List<WebElement> quickFacts;

        @FindBy(xpath = "//div[@class='mapper-overlay']")
        WebElement spawnMap;

        @FindBy(xpath = "//h1[@class='heading-size-1']")
        WebElement name;
    }
}
