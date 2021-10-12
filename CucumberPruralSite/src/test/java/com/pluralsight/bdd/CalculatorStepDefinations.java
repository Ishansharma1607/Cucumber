package com.pluralsight.bdd;


import static org.assertj.core.api.Assertions.*;

import com.pluralsight.bdd.calculator.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinations {
	Calculator calculator;
	int result;
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	   calculator = new Calculator();
	} 

	@When("I add {int} and {int}")
	public void i_add_and(Integer a, Integer b) {
	   result = calculator.add(a,b);
	}

	@Then("I Should Get {int}")
	public void i_should_get(Integer expectedResult) {
		assertThat(result).isEqualTo(expectedResult);
		
	}

}
