package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.Spinner;

public class SpinnerTest extends BaseTest{
	
	Spinner spin ;
	
	@Test(description = "To verify wether Spinner works as expected")
	public void ToVerifySpinner()
	{
		spin = new Spinner(driver);
		spin.toVerifySpinner();
	}

}
