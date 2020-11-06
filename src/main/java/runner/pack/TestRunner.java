package runner.pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
glue = "step.def.pack",
tags = {"@Facebook"},
monochrome = false,
dryRun = false,
format= {"pretty","html:target/Reports"})

public class TestRunner {

}
