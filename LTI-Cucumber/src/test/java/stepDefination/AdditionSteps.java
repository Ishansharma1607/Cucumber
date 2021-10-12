package stepDefination;

import java.util.List;
import java.util.Map;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionSteps {
	
	int a , b, c;

@Given("I have two variables {int} & {int}")
public void i_have_two_variables(Integer num1, Integer num2) {
    a = num1;
    b = num2;
	
}

@Given("I have two variables as below")
public void i_have_two_variables_as_below(List<Integer> num) {
    a = num.get(0);
    b = num.get(1);
    
}

//@Given("I have two variables as below map")
//public void i_have_two_variables_as_below_map(io.cucumber.datatable.DataTable dataTable) {
//   Map<String,String> data = dataTable.asMap(String.class, String.class);
//   String x = data.get("num1");
//   String y = data.get("num2");
//  a = Integer.parseInt(x);
//  b = Integer.parseInt(y); 
//}

@Given("I have two variables as below map")
public void i_have_two_variables_as_below_map(io.cucumber.datatable.DataTable dataTable) {
	Map<String,Integer> data = dataTable.asMap(String.class, Integer.class);
	a= data.get("num1"); 
	b= data.get("num2");
}


@When("I do addition")
public void i_do_addition() {
    c= a+b;
}




@Then("result should shoud display in Console")
public void result_should_shoud_display_in_console() {
    
	System.out.println("The Result Should Be "+c);
}

}
