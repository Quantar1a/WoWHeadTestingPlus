package com.project.pages.pageObjects;

import com.project.pages.BaseSeleniumPage;
import com.project.pages.pageComponents.TodayInWoWPage;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.PageObject;
import org.openqa.selenium.support.PageFactory;

@LastUpdatePoint("05.12.2023")
public class WoWHeadMainPage extends BaseSeleniumPage implements PageObject
{
    private Locators locators;
    public TodayInWoWPage todayInWoWPage;

    public WoWHeadMainPage()
    {
        locators = new Locators();
        todayInWoWPage = new TodayInWoWPage();
    }

    private class Locators
    {
        Locators()
        {
            PageFactory.initElements(webDriver, this);
        }
    }
}
