package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.TabsAndWindows;



public class TabsAndWindowsTest extends BaseTest {
	
	TabsAndWindows tabsAndwindows;
	
	@Test(description = "Test To Verify That After Clicking Button It Changes the Tab")
	public void testToSwitchToOtherTab()
	{
		//startUp(Routes.framesAndWindows);
		tabsAndwindows = new TabsAndWindows(driver);
		tabsAndwindows.switchToAnotherTab();
		
	}
	
}
