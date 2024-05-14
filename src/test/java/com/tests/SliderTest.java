package com.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.Slider;
import utils.Routes;

public class SliderTest extends BaseTest {

	Slider slide ;
	
	
	@Test(description = "Verifying Sliders Are Working")
	public void VerifyingSlidersAreWorking()
	{
		startUp(Routes.slider);
		slide =new Slider(driver);
		slide.SliderCanSlide();
	}

}
