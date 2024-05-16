package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.AccordionsAndTabs;



public class AccordionTests extends BaseTest {
	
	@Test(description = "To verify That Accordions Are Working")
	public void verifyThatAccordionsAreWorking() throws InterruptedException
	{
		//startUp(Routes.TabsAndAccordians);
	    AccordionsAndTabs accordions = new AccordionsAndTabs(driver);
	    accordions.switchToAframe();
	    accordions.accordionsIsWorking();
	}
	
	
}
