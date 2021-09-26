package website.loyaltypoints.cucumber.features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/pizzaria/cucumber/features", glue = "pizzaria.cucumber")
public class RunCucumberTest {

}
