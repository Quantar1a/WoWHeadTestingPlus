package com.project.pages;

import com.project.tools.annotations.LastUpdatePoint;
import org.openqa.selenium.WebDriver;

@LastUpdatePoint("09.12.2023")
public abstract class AbstractPage
{
    protected static WebDriver webDriver;

    public static void setWebDriver(WebDriver driver)
    {
        webDriver = driver;
    }
}
