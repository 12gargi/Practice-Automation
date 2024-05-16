package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.SelectElements;

public class SelectElementsTest  extends BaseTest{
	
	SelectElements select ;
	
	@Test(description = " To Verify that it can select Multiple Element ")
	public void toVerifyMultipleSelect() throws InterruptedException
	{
		select = new SelectElements(driver);
		select.toSelectMutiEelement();
	}

}
