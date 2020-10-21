package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\SeleniuymCucumber\\Features\\OrangeHRM.feature",
glue="stepdefinition",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:target/test-output"})
public class Testrunner {

}
