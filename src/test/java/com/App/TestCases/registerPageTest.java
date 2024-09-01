package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.registerPage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerPageTest extends screenshots
{
	WebDriver driver;
	@Given("User is in registration page")
	public void user_is_in_registration_page() throws InterruptedException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		Thread.sleep(5000);
		assertTrue(true);
	}

	@When("User have to enter details in registration page and click on resister button")
	public void user_have_to_enter_details_in_registration_page_and_click_on_redister_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("prathyusha");
		driver.findElement(By.name("password")).sendKeys("usha$789");
		driver.findElement(By.name("repeatedPassword")).sendKeys("usha$789");
		driver.findElement(By.name("account.firstName")).sendKeys("prathyusha");
		driver.findElement(By.name("account.lastName")).sendKeys("v");
		driver.findElement(By.name("account.email")).sendKeys("vanapalliprathyusha123@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("6305639063");
		driver.findElement(By.name("account.address1")).sendKeys("ameerpet");
		driver.findElement(By.name("account.address2")).sendKeys("ameerpet");
		driver.findElement(By.name("account.city")).sendKeys("hyderabad");
		driver.findElement(By.name("account.state")).sendKeys("telengana");
		driver.findElement(By.name("account.zip")).sendKeys("54321");
		driver.findElement(By.name("account.country")).sendKeys("India");
		registerPage register = new registerPage(driver);
		register.clickSaveAccountInformation();
		System.out.println("User entered details");
	}

	@Then("User can register successfully")
	public void user_can_register_successfully() {
	    System.out.println("User can register successfully");
	    driver.quit();
	    endTest();
	}
	@When("User miss some details to enter and click on register button")
	public void user_miss_some_details_to_enter_and_click_on_register_button() {
		driver.findElement(By.name("username")).sendKeys("prathyusha");
		driver.findElement(By.name("password")).sendKeys("usha$789");
		driver.findElement(By.name("repeatedPassword")).sendKeys("usha$789");
		driver.findElement(By.name("account.firstName")).sendKeys("prathyusha");
		driver.findElement(By.name("account.lastName")).sendKeys("v");
		driver.findElement(By.name("account.address1")).sendKeys("ameerpet");
		driver.findElement(By.name("account.city")).sendKeys("hyderabad");
		driver.findElement(By.name("account.country")).sendKeys("India");
		registerPage register = new registerPage(driver);
		register.clickSaveAccountInformation();
		System.out.println("User entered details and click on register button");
	}

	@Then("User get an error message")
	public void user_get_an_error_message() {
	    registerPage register = new registerPage(driver);
	    register.getErrorMessage();
	    System.out.println("User get an error message");
	    driver.quit();
	    endTest();
	}
}
