package com.project.testParts.before;

import org.testng.annotations.BeforeClass;

@FunctionalInterface
public interface IBeforeClass
{
    @BeforeClass
    void beforeClass();
}
