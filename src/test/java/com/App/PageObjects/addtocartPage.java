package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addtocartPage
{
	WebDriver driver;
	By addToCartButton = By.xpath("//a[@class='Button']");
	public addtocartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickAddToCartButton()
	{
		driver.findElement(addToCartButton).click();
	}
}
