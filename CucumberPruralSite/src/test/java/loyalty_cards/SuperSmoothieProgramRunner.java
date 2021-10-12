package loyalty_cards;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/pluralsight/bdd/feaures/loyalty_cards/super_smoothies_program.feature",
		glue="loyalty_cards",
		monochrome = true,  // Formating Console outcome
		//dryRun= true,
		plugin = {"pretty","html:target/htmlReport.html","json:target/jsonReport/report.json"} //Printing matching Step defination of steps
		
		)
public class SuperSmoothieProgramRunner {

}
