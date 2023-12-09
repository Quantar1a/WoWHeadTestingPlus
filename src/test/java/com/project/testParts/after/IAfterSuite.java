package com.project.testParts.after;

import org.testng.annotations.AfterSuite;

@FunctionalInterface
public interface IAfterSuite
{
    @AfterSuite
    void afterSuite();
}
