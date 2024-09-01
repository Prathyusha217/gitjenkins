package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.homePage;
import com.App.PageObjects.signInPage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signInPageTest extends screenshots
{
	WebDriver driver;
	@Given("User is in main page")
	public void user_is_in_main_page() {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com");
		System.out.println("The user in the HOME page");
		assertTrue(true);
		homePage home = new homePage(driver);
		home.clickEntertheStore();
	}

	@When("User click on the Sign In link")
	public void user_click_on_the_Sign_In_link() throws InterruptedException, IOException {
		signInPage signin = new signInPage(driver);
	    signin.clickSignInLink();
	    Thread.sleep(5000);
	    takeScreenshot(driver);
	    System.out.println("User click on the Sign In link");
	}

	@Then("User reaches the Sign In page")
	public void user_reaches_the_Sign_In_page() {
		System.out.println("User reaches the Sign In page");
		driver.quit();
		endTest();
		endReport();
	}
}
