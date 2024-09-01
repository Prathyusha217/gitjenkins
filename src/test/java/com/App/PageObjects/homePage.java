package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage
{
	WebDriver driver;
	WebElement entertheStore;
	public homePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickEntertheStore()
	{
		entertheStore = driver.findElement(By.linkText("Enter the Store"));
		entertheStore.click();
	}
}
