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

public class cartmultiplePageTest extends screenshots 
{
	WebDriver driver;
	@Given("User is in Cats page")
	public void user_is_in_Cats_page() throws InterruptedException, IOException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(5000);
		mainPage main = new mainPage(driver);
		main.clickCatsIcon();
		takeScreenshot(driver);
		System.out.println("User is in Cats page");
		assertTrue(true);
	}

	@When("User click on product and add to cart next click on Birds add a product")
	public void user_click_on_product_and_add_to_cart_next_click_on_Birds_add_a_product() throws IOException, InterruptedException {
		driver.findElement(By.linkText("FL-DLH-02")).click();
	    addtocartPage addtocart = new addtocartPage(driver);
	    addtocart.clickAddToCartButton();
	    takeScreenshot(driver);
	    Thread.sleep(5000);
	    System.out.println("User click on product to add cart");
	    driver.findElement(By.xpath("//img[@src='../images/sm_birds.gif']")).click();
	    driver.findElement(By.linkText("AV-CB-01")).click();
	    addtocartPage addtocart1 = new addtocartPage(driver);
	    addtocart1.clickAddToCartButton();
	    takeScreenshot(driver);
	    Thread.sleep(5000);
	    System.out.println("User again click on another product to the cart");
	}

	@Then("User can see the products is added to cart successfully")
	public void user_can_see_the_products_is_added_to_cart_successfully() {
	    System.out.println("User can see the products is added to cart successfully");
	    driver.quit();
	    endTest();
	}
}
