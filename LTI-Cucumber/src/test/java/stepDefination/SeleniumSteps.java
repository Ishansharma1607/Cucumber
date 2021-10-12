package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SeleniumSteps {
	WebDriver driver;

	@Given("User is on Home Page of Selenium")
	public void user_is_on_home_page_of_selenium() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

	}

	@When("User Clicks on Download Link")
	public void user_clicks_on_download_link() {
		driver.findElement(By.linkText("Downloads")).click();
	}

	@Then("Title Should be {string}")
	public void title_should_be(String string) {
		Assert.assertEquals(string, driver.getTitle());
		driver.quit();
	}

}
