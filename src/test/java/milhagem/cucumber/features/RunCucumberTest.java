package milhagem.cucumber.features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/milhagem/cucumber/features", glue = "milhagem.cucumber", publish = true)
public class RunCucumberTest {
}
