package com.tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.AccordionsAndTabs;
import pageObject.FirstStep;
import utils.Routes;


public class AccordionTests extends BaseTest {
	
	@Test(description = "To verify That Accordions Are Working")
	public void verifyThatAccordionsAreWorking() throws InterruptedException
	{
		startUp(Routes.TabsAndAccordians);
	    AccordionsAndTabs accordionsAndTabs = new AccordionsAndTabs(driver);
	    accordionsAndTabs.accordionsIsWorking();
	}
	
	
}
