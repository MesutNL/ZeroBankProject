package RunnerClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags = {"@Group1"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json",
        })
public class TestRunClass extends AbstractTestNGCucumberTests {
}
