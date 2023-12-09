package com.project.stepDefinitions;

import com.project.data.Configuration;
import com.project.pages.AbstractPage;
import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.classes.Setting;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

@LastUpdatePoint("05.12.2023")
public class Initialization
{
    protected static WebDriver driver;

    @Before
    public void initialization()
    {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        Setting.setBrowser(Configuration.currentBrowser);
        Setting.deleteCookie(Configuration.isClearAllCookie);
        Setting.setTimeouts(Configuration.pageLoadTimeout, Configuration.implicitlyWait);
        Setting.setWindowMode(Configuration.currentWindowMode);
        driver = Setting.obtainWebDriver();
        AbstractPage.setWebDriver(driver);
    }

    @After
    public void closure()
    {
        driver.quit();
    }
}
