package com.pluralsight.bdd;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
features = "src/test/resources/com/pluralsight/calculator.feature",
glue="com.pluralsight.bdd",
monochrome = true,  // Formating Console outcome
//	dryRun= true,
plugin = {"pretty"} //Printing matching Step defination of steps
)

public class CalculatorTest {
	
	

}
