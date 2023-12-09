package com.project.pages.pageComponents;

import com.project.pages.AbstractLocators;
import com.project.pages.AbstractPage;
import com.project.tools.classes.PageObject;

public class TopPanelComponent extends AbstractPage implements PageObject
{
    private Locators locators;

    public TopPanelComponent()
    {
        locators = new Locators();
    }



    private class Locators extends AbstractLocators
    {
        Locators()
        {
            super(webDriver);
        }
    }
}
