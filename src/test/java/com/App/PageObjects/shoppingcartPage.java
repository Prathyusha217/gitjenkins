package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shoppingcartPage 
{
	WebDriver driver;
	public shoppingcartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickCart() {
		driver.findElement(By.xpath("//img[@src='../images/cart.gif']")).click();
	}
	public void updateQuantity(String productId, int quantity) {
		WebElement quantityField = driver.findElement(By.name(productId));
		quantityField.clear();
		quantityField.sendKeys(String.valueOf(quantity));
		driver.findElement(By.name("updateCartQuantities")).click();
	}
	public void removeProduct() {
		WebElement removeButton = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[2]"));
		removeButton.click();
	}
}
