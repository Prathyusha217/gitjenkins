package com.App.TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.homePage;
import com.App.PageObjects.mainPage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainPageTest extends screenshots
{
	WebDriver driver;
	@Given("User is in the mainpage")
	public void user_is_in_the_mainpage() throws InterruptedException {
		startTest();
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://petstore.octoperf.com");
        homePage home = new homePage(driver);
        home.clickEntertheStore();
        Thread.sleep(5000);
        System.out.println("User is in the mainpage");
        assertTrue(true);
	}

	@When("User click on the Fish icon")
	public void user_click_on_the_Fish_icon() {
		System.out.println("User click on the Fish icon");
	    mainPage main= new mainPage(driver);
	    main.clickFishIcon(); 
	}

	@Then("User reaches the fish products page.")
	public void user_reaches_the_fish_products_page() throws InterruptedException {
		System.out.println("User reaches the fish products page");
		Thread.sleep(5000);
		driver.quit();
		endTest();
	}

	@When("User click on the Dogs icon")
	public void user_click_on_the_Dogs_icon() {
		System.out.println("User click on the Dogs icon");
		mainPage main= new mainPage(driver);
	    main.clickDogsIcon();
	}

	@Then("User reaches the Dogs products page.")
	public void user_reaches_the_Dogs_products_page() throws InterruptedException {
		System.out.println("User reaches the Dogs products page");
		Thread.sleep(5000);
		driver.quit();
		endTest();
	}

	@When("User click on the Cats icon")
	public void user_click_on_the_Cats_icon() {
		System.out.println("User click on the Cats icon");
		mainPage main= new mainPage(driver);
	    main.clickCatsIcon();
	}

	@Then("User reaches the Cats products page.")
	public void user_reaches_the_Cats_products_page() throws InterruptedException {
		System.out.println("User reaches the cats products page");
		Thread.sleep(5000);
		driver.quit();
		endTest();
	}

	@When("User click on the Reptiles icon")
	public void user_click_on_the_Reptiles_icon() {
		System.out.println("User click on the Reptiles icon");
		mainPage main= new mainPage(driver);
	    main.clickReptilesIcon();
	}

	@Then("User reaches the Reptiles products page.")
	public void user_reaches_the_Reptiles_products_page() throws InterruptedException {
		System.out.println("User reaches the Reptiles products page");
		Thread.sleep(5000);
		driver.quit();
		endTest();
	}

	@When("User click on the Birds icon")
	public void user_click_on_the_Birds_icon() {
		System.out.println("User click on the Birds icon");
		mainPage main= new mainPage(driver);
	    main.clickBirdsIcon();
	}

	@Then("User reaches the Birds products page.")
	public void user_reaches_the_Birds_products_page() throws InterruptedException {
		System.out.println("User reaches the Birds products page");
		Thread.sleep(5000);
		driver.quit();
		endTest();
	}
}