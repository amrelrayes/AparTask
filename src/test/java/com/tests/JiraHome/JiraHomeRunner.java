package com.tests.JiraHome;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/CL_Task/tests/JiraHome",
        glue = {"com.CL_Task.tests"},
        plugin = {"html:reports/JiraHome-Report.html"},
        monochrome = true
)
public class JiraHomeRunner extends AbstractTestNGCucumberTests {
}
