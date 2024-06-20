package in.facebook.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\karth\\eclipse-workspace\\cuccumber\\src\\test\\resources\\FeatureFiles",
glue={"stepDefinition","fb.hooks"},dryRun=false,monochrome=true,plugin={"html:screenshots","json:target/fbreport.json"},
tags={"@first","@second"})
public class TestRunner {

}
