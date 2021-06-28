package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/feature"},
		glue = {"stepdefinition"},
	    plugin = { "pretty", "json:target/cucumber.json" }, 
		monochrome = true
		
		
		
		
		
	
		)

public class TestRunner {

}
