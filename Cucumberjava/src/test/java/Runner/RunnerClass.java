package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features="featurefiles/*" ,glue="stepDefinitions" ,dryRun=false,monochrome=true )
public class RunnerClass {
	
	 // it should combine the feature file and the step definition
	// Runner define

}
