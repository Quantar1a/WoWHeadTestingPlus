package com.project.pages.pageComponents;

import com.project.pages.AbstractLocators;
import com.project.pages.AbstractPage;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@LastUpdatePoint("09.12.2023")
public class TodayInWoWComponent extends AbstractPage implements PageObject
{
    private final Locators locators;

    public TodayInWoWComponent()
    {
        locators = new Locators();
    }

    public WebElement selectSpecificRealm(String realm)
    {
        WebElement switcher = null;
        switch (realm)
        {
            case "NA" -> switcher = locators.NASwitcher;
            case "EU" -> switcher = locators.EUSwitcher;
        }
        return switcher;
    }

    public WebElement getTokenPrice(String realm)
    {
        WebElement token = null;
        switch (realm)
        {
            case "NA" -> token = locators.NATokenPrice;
            case "EU" -> token = locators.EUTokenPrice;
        }
        return token;
    }

    public WebElement selectString(String realm)
    {
        WebElement string = null;
        switch (realm)
        {
            case "NA" -> string = locators.WOWTokenStringNA;
            case "EU" -> string = locators.WOWTokenStringEU;
        }
        return string;
    }

    public WebElement getMythicPlusTitleText(String realm)
    {
        WebElement title = null;
        switch (realm)
        {
            case "NA" -> title = locators.mythicPlusAffixesNAText;
            case "EU" -> title = locators.mythicPlusAffixesEUText;
        }
        return title;
    }

    public List<WebElement> getListOfMythicAffixes(String realm)
    {
        List<WebElement> list = null;
        switch (realm)
        {
            case "NA" -> list = locators.NAMythicAffixesList;
            case "EU" -> list = locators.EUMythicAffixesList;
        }
        return list;
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
    }
}
