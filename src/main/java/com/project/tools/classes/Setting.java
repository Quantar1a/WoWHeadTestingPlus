package com.project.tools.classes;

import com.project.tools.annotations.LastUpdatePoint;
import com.project.tools.enums.Browsers;
import com.project.tools.enums.WindowMode;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

@LastUpdatePoint("05.12.2023")
public class Setting
{
    private static WebDriver driver;

    public static WebDriver obtainWebDriver()
    {
        return driver;
    }

    public static void deleteCookie(boolean isDeleteCookie)
    {
        if (isDeleteCookie)
        {
            driver.manage().deleteAllCookies();
        }
    }

    public static void setWindowMode(WindowMode windowMode)
    {
        switch (windowMode)
        {
            case MAXIMIZE -> driver.manage().window().maximize();
            case MINIMAZE -> driver.manage().window().minimize();
        }
    }

    public static void setBrowser(Browsers browser)
    {
        switch (browser)
        {
            case MS_EDGE -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case CHROME -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        }
    }

    public static void setTimeouts(Duration pageLoadTimeout, Duration implicitlyWait)
    {
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout);
        driver.manage().timeouts().implicitlyWait(implicitlyWait);
    }

    public static void openURL(String URL)
    {
        driver.get(URL);
    }
}
