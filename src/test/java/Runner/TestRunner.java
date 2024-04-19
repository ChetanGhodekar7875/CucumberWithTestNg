package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/resources/Feature"},
glue = "StepImplementation",
monochrome = true,
snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:cucumber-reports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
