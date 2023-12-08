package com.project.featureRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        plugin = {"pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features/mainPageScenarios",
        glue = "com.project.stepDefinitions"
)
public class CustomFeatureRunner extends AbstractTestNGCucumberTests
{
}
