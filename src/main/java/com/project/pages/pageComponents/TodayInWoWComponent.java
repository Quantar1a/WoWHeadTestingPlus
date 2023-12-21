package com.project.pages.pageComponents;

import com.project.pages.AbstractLocators;
import com.project.pages.AbstractPage;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

@LastUpdatePoint("21.12.2023")
public class TodayInWoWComponent extends AbstractPage implements PageObject
{
    private final Locators locators;

    public TodayInWoWComponent()
    {
        locators = new Locators();
    }

    public WebElement selectSpecificRealm(String realm)
    {
        switch (realm) {
            case "NA" -> {
                return locators.NASwitcher;
            }
            case "EU" -> {
                return locators.EUSwitcher;
            }
            default -> {
                return null;
            }
        }
    }

    public WebElement getTokenPrice(String realm)
    {
        switch (realm) {
            case "NA" -> {
                return locators.NATokenPrice;
            }
            case "EU" -> {
                return locators.EUTokenPrice;
            }
            default -> {
                return null;
            }
        }
    }

    public WebElement selectWoWTokenString(String realm)
    {
        switch (realm) {
            case "NA" -> {
                return locators.WOWTokenStringNA;
            }
            case "EU" -> {
                return locators.WOWTokenStringEU;
            }
            default -> {
                return null;
            }
        }
    }

    public WebElement getMythicPlusTitleText(String realm)
    {
        switch (realm) {
            case "NA" -> {
                return locators.mythicPlusAffixesNAText;
            }
            case "EU" -> {
                return locators.mythicPlusAffixesEUText;
            }
            default -> {
                return null;
            }
        }
    }

    public List<WebElement> getListOfMythicAffixes(String realm)
    {
        switch (realm) {
            case "NA" -> {
                return locators.NAMythicAffixesList;
            }
            case "EU" -> {
                return locators.EUMythicAffixesList;
            }
            default -> {
                return null;
            }
        }
    }

    public WebElement getWorldBossTitle(String currentRealm)
    {
        switch (currentRealm)
        {
            case "NA" -> {
                return locators.NADFWorldBossTitle;
            }
            case "EU" -> {
                return locators.EUDFWorldBossTitle;
            }
            default -> {
                return null;
            }
        }
    }

    public List<WebElement> getWorldBossList(String currentRealm)
    {
        switch (currentRealm) {
            case "NA" ->{
                return locators.NABossList;
            }
            case "EU" ->{
                return locators.EUBossList;
            }
            default -> {
                return null;
            }
        }
    }

    public void clickToFirstBossInList(String realm)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) webDriver;
        Actions action = new Actions(webDriver);
        switch (realm) {
            case "NA" ->{
                jsExecutor.executeScript("arguments[0].scrollIntoView();", locators.firstBossNA);
                locators.firstBossNA.click();
            }
            case "EU" ->{
                jsExecutor.executeScript("arguments[0].scrollIntoView();", locators.firstBossEU);
                locators.firstBossEU.click();
            }
        }
    }

    private class Locators extends AbstractLocators
    {
        public Locators()
        {
            super(webDriver);
        }

        @FindBy(xpath = "//a[@class='switcher-choice'][text()='EU']")
        WebElement EUSwitcher;

        @FindBy(xpath = "//a[@class='switcher-choice'][text()='NA']")
        WebElement NASwitcher;

        @FindBy(xpath = "//section[@id='US-group-wow-token-price']//span")
        WebElement NATokenPrice;

        @FindBy(xpath = "//section[@id='EU-group-wow-token-price']//span")
        WebElement EUTokenPrice;

        @FindBy(xpath = "//section[@id='EU-group-wow-token-price']//a[text()='WoW Token']")
        WebElement WOWTokenStringEU;

        @FindBy(xpath = "//section[@id='US-group-wow-token-price']//a[text()='WoW Token']")
        WebElement WOWTokenStringNA;

        @FindBy(xpath = "//section[@id='US-group-mythicaffix']//a[@class=' tiw-group-name-link']")
        WebElement mythicPlusAffixesNAText;

        @FindBy(xpath = "//section[@id='EU-group-mythicaffix']//a[@class=' tiw-group-name-link']")
        WebElement mythicPlusAffixesEUText;

        @FindBy(xpath = "//section[contains(@id, \"US-group-mythicaffix-line-\")]")
        List<WebElement> NAMythicAffixesList;

        @FindBy(xpath = "//section[contains(@id, \"EU-group-mythicaffix-line-\")]")
        List<WebElement> EUMythicAffixesList;

        @FindBy(xpath = "//section[contains(@id, 'EU-group-epiceliteworlddf-line-')]")
        List<WebElement> EUBossList;

        @FindBy(xpath = "//section[contains(@id, 'US-group-epiceliteworlddf-line-')]")
        List<WebElement> NABossList;

        @FindBy(xpath = "//section[contains(@id, 'US')]//a[text()='DF World Boss']")
        WebElement NADFWorldBossTitle;

        @FindBy(xpath = "//section[contains(@id, 'EU')]//a[text()='DF World Boss']")
        WebElement EUDFWorldBossTitle;

        @FindBy(xpath = "//section[@id='EU-group-epiceliteworlddf-line-0']//a")
        WebElement firstBossEU;

        @FindBy(xpath = "//section[@id='US-group-epiceliteworlddf-line-0']//a")
        WebElement firstBossNA;
    }
}
