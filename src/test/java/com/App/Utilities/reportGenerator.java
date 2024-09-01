package com.App.Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportGenerator 

{
	public static ExtentReports extent;
	public static ExtentTest logger;
	static int i = 1;
	public void startReport()
	{
		extent = new ExtentReports("C:\\Wipro java programs\\JPetStoreProject\\src\\test\\resources\\reports\\results.html", true);
	}
	public void startTest()
	{
		logger = extent.startTest("test" + i);
	    i++;
	    logger.log(LogStatus.PASS, "Test is pass");
	}
	public void endTest()
	{
	    extent.endTest(logger);
	}
	public void endReport()
	{
	    extent.flush();
	    extent.close();
	}
}
