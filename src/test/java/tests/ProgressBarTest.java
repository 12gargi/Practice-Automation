package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.ProgressBar;


public class ProgressBarTest extends BaseTest {

	ProgressBar progressbar;
	
	@Test(description = "test to verify ProgressBar Start Download Button working")
	public void testForProgressBarButton() throws InterruptedException
	{
		//startUp(Routes.ProgressBar);
		progressbar = new ProgressBar(driver);
		progressbar.ProgressBarButtonVerification(driver);
	}
	
	/*@Test(description = "test to verify ProgressBar completes 100%")
	public void testFor100PercentCompletion() 
	{
		//startUp(Routes.ProgressBar);
		progressbar = new ProgressBar(driver);
		progressbar.ProgressBarcompletes100Percent();
	}*/
}
