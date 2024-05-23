package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.Datepicker;

public class DatepickerTest extends BaseTest {

	Datepicker date;
	
	@Test(description = "test to pick date from datepicker")
	public void testdatepicker() throws InterruptedException
	{
		date = new Datepicker(driver);
		date.verifyDatepicker();
	}
}
