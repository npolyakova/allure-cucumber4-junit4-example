package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
        features = "src/test/resources/features",
        glue = "org.example.steps"
)
public class JUnitRunnerTest {
}
