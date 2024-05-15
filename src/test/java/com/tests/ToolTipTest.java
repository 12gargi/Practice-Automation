package com.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.Tooltip;
import utils.Routes;

public class ToolTipTest extends BaseTest {

	Tooltip tooltip ;
	
	@Test(description = "test to verify whether the tooltip works fine")
	public void testToVerifyTooltipFunctionality()
	{
		//startUp(Routes.tooltip);
		tooltip = new Tooltip(driver);
		tooltip.testForToolTip();
	}
}
