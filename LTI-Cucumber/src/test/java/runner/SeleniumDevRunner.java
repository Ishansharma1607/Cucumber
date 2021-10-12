package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/seleniumDev.feature",
		glue="stepDefination",
		monochrome = true,  // Formating Console outcome
		//dryRun= true,
		plugin = {"pretty","html:target/htmlReport.html","json:target/jsonReport/report.json"} //Printing matching Step defination of steps
		
		)
public class SeleniumDevRunner {

}
