package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.App.PageObjects.homePage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homePageTest extends screenshots 
{
	WebDriver driver;
	@Given("the user in the HOME page")
	public void the_user_in_the_HOME_page() throws IOException, InterruptedException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com");
		Thread.sleep(5000);
		takeScreenshot(driver);
		System.out.println("The user in the HOME page");
		assertTrue(true);
	}

	@When("he clicks on the Enter the Store link")
	public void he_clicks_on_the_Enter_the_Store_link() throws IOException, InterruptedException {
		homePage home = new homePage(driver);
		home.clickEntertheStore(); 
		takeScreenshot(driver);
		Thread.sleep(5000);
		System.out.println("He clicks on the Enter the Store link");
	}

	@Then("he reaches the MAIN page")
	public void he_reaches_the_MAIN_page() {
		System.out.println("He reaches the MAIN page");
		driver.quit();
		endTest();
	}
}
