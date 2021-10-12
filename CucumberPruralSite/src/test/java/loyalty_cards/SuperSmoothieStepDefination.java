package loyalty_cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuperSmoothieStepDefination {



	private DrinkCatalog drinkCatalog;

	@Given("the following drink categories")

	public void the_following_drink_categories(List<Map<String, String>> drinkCategories) {
		drinkCategories.stream().forEach(
				drinkCategory -> {

			String drink = drinkCategory.get("Drink");
			String category = drinkCategory.get("Category");
			Integer points = Integer.parseInt(drinkCategory.get("Points"));

			drinkCatalog.addDrink(drink, category);

		}

		);

	}

	@Given("^(.*) is a Morning Freshness Member$")
	public void ishan_is_a_morning_freshness_member(String name) {

	}

	@When("^(.*) purchases (\\d +) (.*) drinks?")
	public void ishan_purchases_banana_drinks(String name, Integer int1, String drink) {

	}

	@Then("he should earn {int} points")
	public void he_should_earn_points(Integer expectedPoints) {

	}

}
