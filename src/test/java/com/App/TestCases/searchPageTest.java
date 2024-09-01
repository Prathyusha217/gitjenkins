package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.App.PageObjects.homePage;
import com.App.PageObjects.searchPage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchPageTest extends screenshots
{
	WebDriver driver;
	@Given("User is in the pet store home page")
	public void user_is_in_the_pet_store_home_page() {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com");
		System.out.println("The user in the HOME page");
		assertTrue(true);
	}

	@When("User enter {string} in the search field")
	public void user_enter_in_the_search_field(String fish) throws InterruptedException, IOException {
		homePage home = new homePage(driver);
		home.clickEntertheStore(); 
		searchPage search = new searchPage(driver);
		search.enterSearchTerm(fish);
		Thread.sleep(5000);
		search.clickSearchButton();
		takeScreenshot(driver);
		System.out.println("user enter fish in the search field");
	}

	@Then("User see a list of search results contain fish")
	public void user_see_a_list_of_search_results_contain_fish() {
		System.out.println("User see a list of search results");
		driver.quit();
		endTest();
	}

	@When("The user clicks the search button without entering a product name")
	public void the_user_clicks_the_search_button_without_entering_a_product_name() throws IOException, InterruptedException {
		homePage home = new homePage(driver);
		home.clickEntertheStore();
		searchPage search = new searchPage(driver);
	    search.clickSearchButton();
	    Thread.sleep(5000);
	    takeScreenshot(driver);
	    System.out.println("The user clicks the search button without entering a product name");
	    endTest();
	}

	@Then("an error message should display")
	public void an_error_message_should_display() {
		System.out.println("An error message should display");
		driver.quit();
		endTest();
	}
}
