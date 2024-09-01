package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage 
{
	WebDriver driver;
	WebElement FishIcon;
	WebElement DogsIcon;
	WebElement CatsIcon;
	WebElement ReptilesIcon;
	WebElement BirdsIcon;
	public mainPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void clickFishIcon()
	{
		FishIcon = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
	    FishIcon.click();
	}
	public void clickDogsIcon()
	{
	    DogsIcon = driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']"));
	    DogsIcon.click();
	} 
	public void clickCatsIcon()
	{
		CatsIcon = driver.findElement(By.xpath("//img[@src='../images/cats_icon.gif']"));
	    CatsIcon.click();
	}
	public void clickReptilesIcon()
	{
		ReptilesIcon = driver.findElement(By.xpath("//img[@src='../images/reptiles_icon.gif']"));
	    ReptilesIcon.click();
	}
	public void clickBirdsIcon()
	{
		BirdsIcon = driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']"));
	    BirdsIcon.click();
	}
}
