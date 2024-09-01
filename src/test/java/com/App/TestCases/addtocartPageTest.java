package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.addtocartPage;
import com.App.PageObjects.mainPage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addtocartPageTest extends screenshots
{
	WebDriver driver;
	@Given("User is in Dogs page")
	public void user_is_in_Dogs_page() throws IOException, InterruptedException {
		startReport();
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(5000);
		mainPage main = new mainPage(driver);
		main.clickDogsIcon();
		takeScreenshot(driver);
		System.out.println("User is in Dogs page");
		assertTrue(true);
	}

	@When("User click on Product id and click on add to cart")
	public void user_click_on_Product_id_and_click_on_add_to_cart() throws IOException, InterruptedException {
	    driver.findElement(By.linkText("K9-RT-01")).click();
	    addtocartPage addtocart = new addtocartPage(driver);
	    addtocart.clickAddToCartButton();
	    takeScreenshot(driver);
	    Thread.sleep(5000);
	    System.out.println("User click on Product id and click on add to cart");
	}

	@Then("User can see a product in cart page")
	public void user_can_see_a_product_in_cart_page() {
	    System.out.println("User can see a product in cart page");
	    driver.quit();
	    endTest();
	}
}