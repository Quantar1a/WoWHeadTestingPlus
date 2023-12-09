package com.project.testParts.after;

import org.testng.annotations.AfterGroups;

@FunctionalInterface
public interface IAfterGroups
{
    @AfterGroups
    void afterGroups();

}
