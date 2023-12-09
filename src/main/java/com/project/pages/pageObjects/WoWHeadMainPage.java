package com.project.pages.pageObjects;

import com.project.pages.AbstractLocators;
import com.project.pages.AbstractPage;
import com.project.pages.pageComponents.TodayInWoWComponent;
import com.project.pages.pageComponents.TopPanelComponent;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.PageObject;

@LastUpdatePoint("09.12.2023")
public class WoWHeadMainPage extends AbstractPage implements PageObject
{
    private final Locators locators;
    public TodayInWoWComponent todayInWoWComponent;
    public TopPanelComponent topPanelComponent;

    public WoWHeadMainPage()
    {
        locators = new Locators();
        todayInWoWComponent = new TodayInWoWComponent();
        topPanelComponent = new TopPanelComponent();
    }



    private class Locators extends AbstractLocators
    {
        Locators()
        {
            super(webDriver);
        }
    }
}
