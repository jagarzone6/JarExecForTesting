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
        format = {"pretty", "html:target/cucumber"},
        glue = "steps")


public class FeatureRunnerTest {
}
