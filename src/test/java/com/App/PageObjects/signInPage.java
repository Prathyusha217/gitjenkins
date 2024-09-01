package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage 
{
	WebDriver driver;
    WebElement Signin;
	public signInPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void clickSignInLink()
	{
		Signin = driver.findElement(By.linkText("Sign In"));
		Signin.click();
	}
}
