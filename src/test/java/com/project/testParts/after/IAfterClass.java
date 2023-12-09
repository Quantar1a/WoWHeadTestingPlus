package com.project.testParts.after;

import org.testng.annotations.AfterClass;

@FunctionalInterface
public interface IAfterClass
{
    @AfterClass
    void afterClass();
}
