package com.project.data;

import com.project.tools.enums.Browsers;
import com.project.tools.enums.WindowMode;

import java.time.Duration;

public class Configuration
{
    //Set specific browser as execution environment
    public static final Browsers currentBrowser = Browsers.CHROME;

    //Set implicitly wait duration, in seconds
    public static final Duration implicitlyWait = Duration.ofSeconds(180);

    //Set page load timeout, in seconds
    public static final Duration pageLoadTimeout = Duration.ofSeconds(180);

    //If true - clear all cookie files
    public static final boolean isClearAllCookie = true;

    //Set window mode
    public static final WindowMode currentWindowMode = WindowMode.MAXIMIZE;


}
