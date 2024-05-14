package com.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.ProgressBar;
import utils.Routes;

public class ProgressBarTest extends BaseTest {

	ProgressBar bar;
	
	@Test(description = "test to verify ProgressBar Start Download Button working")
	public void testForProgressBarButton() throws InterruptedException
	{
		startUp(Routes.ProgressBar);
		bar = new ProgressBar(driver);
		bar.ProgressBarButtonVerification(driver);
	}
	
	@Test(description = "test to verify ProgressBar completes 100%")
	public void testFor100PercentCompletion() 
	{
		startUp(Routes.ProgressBar);
		bar = new ProgressBar(driver);
		bar.ProgressBarcompletes100Percent();
	}
}
