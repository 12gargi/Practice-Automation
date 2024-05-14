package com.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.TabsAndWindows;
import utils.Routes;


public class TabsAndWindowsTest extends BaseTest {
	
	TabsAndWindows taw;
	
	@Test(description = "Test To Verify That After Clicking Button It Changes the Tab")
	public void testToSwitchToOtherTab()
	{
		startUp(Routes.framesAndWindows);
		taw = new TabsAndWindows(driver);
		taw.switchToAnotherTab();
		
	}
	
}
