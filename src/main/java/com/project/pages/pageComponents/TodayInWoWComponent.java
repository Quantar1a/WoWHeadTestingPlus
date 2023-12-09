package com.project.pages.pageComponents;

import com.project.pages.AbstractLocators;
import com.project.pages.AbstractPage;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.PageObject;

@LastUpdatePoint("09.12.2023")
public class TodayInWoWComponent extends AbstractPage implements PageObject
{
    private final Locators locators;

    public TodayInWoWComponent()
    {
        locators = new Locators();
    }



    private class Locators extends AbstractLocators
    {
        public Locators()
        {
            super(webDriver);
        }
    }
}
