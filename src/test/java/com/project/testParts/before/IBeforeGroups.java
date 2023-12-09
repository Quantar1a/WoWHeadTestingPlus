package com.project.testParts.before;

import org.testng.annotations.BeforeGroups;

@FunctionalInterface
public interface IBeforeGroups
{
    @BeforeGroups
    void beforeGroups();
}
