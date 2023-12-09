package com.project.testParts.after;

import org.testng.annotations.AfterTest;

@FunctionalInterface
public interface IAfterTest
{
    @AfterTest
    void afterTest();
}
