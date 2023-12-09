package com.project.pages;

import com.project.tools.annotations.LastUpdatePoint;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@LastUpdatePoint("09.12.2023")
public abstract class AbstractLocators
{
    protected AbstractLocators(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
