package com.project.testParts.before;

import org.testng.annotations.BeforeMethod;

@FunctionalInterface
public interface IBeforeMethod
{
    @BeforeMethod
    void beforeMethod();
}
