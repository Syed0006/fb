package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "features",		// provide folder name
	glue     = "steps",		// location/package name of step definition file 
	plugin	 = {"pretty",
				"json:target/report/json/output.json",
				"html:target/report/html/index.html"},
	tags	 = ("@fb")		// tag name from feature file
		)

public class Runner {			// unused class ???
	

}
