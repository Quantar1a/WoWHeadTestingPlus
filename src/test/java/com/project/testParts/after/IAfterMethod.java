package com.project.testParts.after;

import org.testng.annotations.AfterMethod;

@FunctionalInterface
public interface IAfterMethod
{
    @AfterMethod
    void afterMethod();
}
