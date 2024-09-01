package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.App.PageObjects.addtocartPage;
import com.App.PageObjects.mainPage;
import com.App.PageObjects.shoppingcartPage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shoppingcartPageTest extends screenshots
{
	WebDriver driver;
	@Given("User is in shopping cart")
	public void user_is_in_shopping_cart() throws InterruptedException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		mainPage main = new mainPage(driver);
		main.clickDogsIcon();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//td[contains(text(),'K9')]")).click();
		driver.findElement(By.linkText("K9-RT-01")).click();
		addtocartPage addtocart = new addtocartPage(driver);
	    addtocart.clickAddToCartButton();
		shoppingcartPage cart = new shoppingcartPage(driver);
		cart.clickCart();
		assertTrue(driver.getCurrentUrl().contains("Cart"), "Not in shopping cart");
		System.out.println("User is in shopping cart");
	}

	@When("User is changing the quantity of the product and click on update cart")
	public void user_is_changing_the_quantity_of_the_product_and_click_on_update_cart() throws InterruptedException {
		driver.findElement(By.name("EST-28")).click();
		shoppingcartPage cart = new shoppingcartPage(driver);
		cart.updateQuantity("EST-28", 3);
	    System.out.println("User is changing the quantity of the product and click on update cart");
	}

	@Then("User can see the updated details in the cart")
	public void user_can_see_the_updated_details_in_the_cart() {
	    System.out.println("User can see the updated details in the cart");
	    driver.quit();
	    endTest();
	}

	@When("User click on the remove button")
	public void user_click_on_the_remove_button() throws InterruptedException {
		driver.findElement(By.name("EST-28"));
	    shoppingcartPage cart = new shoppingcartPage(driver);
	    cart.removeProduct();
	    System.out.println("User click on the remove button");
	}

	@Then("User is removed product successfully")
	public void user_is_removed_product_successfully() {
	    System.out.println("User is removed product successfully");
	    driver.quit();
	    endTest();
	}
}
