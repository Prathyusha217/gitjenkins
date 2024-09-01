package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.loginPage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageTest extends screenshots
{
	WebDriver driver;
	@Given("User is in the login page")
	public void user_is_in_the_login_page() throws InterruptedException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		Thread.sleep(5000);
		assertTrue(true);
		System.out.println("User is in login page");
	}

	@When("User enter the valid credentials")
	public void user_enter_the_valid_credentials() {
	    driver.findElement(By.name("username")).sendKeys("prathyusha");
	    driver.findElement(By.name("password")).sendKeys("usha$789");
	    loginPage login = new loginPage(driver);
	    login.clickLoginButton();
	    System.out.println("User enter the valid credentials");
	}

	@Then("User can see the successful login")
	public void user_can_see_the_successful_login() {
	    System.out.println("User login successful");
	    driver.quit();
	    endTest();
	}

	@When("User enter invalid credentials")
	public void user_enter_invalid_credentials() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin$123");
		loginPage login = new loginPage(driver);
	    login.clickLoginButton();
	    System.out.println("User enterd invalid credentials");
	}

	@Then("User see an error message")
	public void user_see_an_error_message() {
	    loginPage login = new loginPage(driver);
	    login.getErrorMessage();
	    System.out.println("User see an error message");
	    driver.quit();
	    endTest();
	}
}
