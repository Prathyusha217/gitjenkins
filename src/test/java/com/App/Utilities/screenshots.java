package com.App.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.messages.internal.com.google.common.io.Files;

public class screenshots extends reportGenerator
{
	static int i =1;
	public void takeScreenshot(WebDriver driver) throws IOException
	{
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\Wipro java programs\\JPetStoreProject\\src\\test\\resources\\screenshots\\JPetStore" + i + ".jpeg"));
		i++;
	}
}
