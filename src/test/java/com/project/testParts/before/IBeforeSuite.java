package com.project.testParts.before;

import org.testng.annotations.BeforeSuite;

@FunctionalInterface
public interface IBeforeSuite
{
    @BeforeSuite
    void beforeSuite();
}
