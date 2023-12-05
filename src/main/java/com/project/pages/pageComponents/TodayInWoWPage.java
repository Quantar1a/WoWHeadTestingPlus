package com.project.pages.pageComponents;

import com.project.pages.BaseSeleniumPage;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.PageObject;
import org.openqa.selenium.support.PageFactory;

@LastUpdatePoint("05.12.2023")
public class TodayInWoWPage extends BaseSeleniumPage implements PageObject
{
    private Locators locators;

    public TodayInWoWPage()
    {
        locators = new Locators();
    }

    private class Locators
    {
        public Locators()
        {
            PageFactory.initElements(webDriver, this);
        }
    }
}
