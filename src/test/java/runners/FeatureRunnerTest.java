package runners;

/**
 * Created by jagarzone on 16/12/15.
 */


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/reports/html", "json:target/reports/json/report.json"},
        glue = "def")

public class FeatureRunnerTest {
}
