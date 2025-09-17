package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/Login.feature",
        glue = "stepsDefinitions",
        plugin = {"pretty"},
        monochrome = true
)
public class TestRunner {
}
