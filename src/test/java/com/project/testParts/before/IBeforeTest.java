package com.project.testParts.before;

import org.testng.annotations.BeforeTest;

@FunctionalInterface
public interface IBeforeTest
{
    @BeforeTest
    void beforeTest();
}
