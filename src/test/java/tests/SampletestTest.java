package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.SampleTest;

public class SampletestTest extends BaseTest {

	SampleTest test;
	
	/*@Test(description="to verify the upload functionality")
	public void toVerifyUploadButton()
	{
		test = new SampleTest(driver);
		test.testForUploadButton();
	}*/
	
	@Test(description="to verify the input functionality of Name , Email and Website")
	public void  toEnterDetails()
	{
		test = new SampleTest(driver);
		test.testForNameEmailAndWebsite("George", "george@gmail.com", "www.george.com");
	}
	
	@Test(description="to verify the Experience Dropdown functionality")
	public void  toVerifyExperienceDropdown()
	{
		test = new SampleTest(driver);
		test.testforExperienceDropdown();
	}
	
	@Test(description="to verify the Functional Checkbox functionality")
	public void  toVerifyFunctionalCheckbox()
	{
		test = new SampleTest(driver);
		test.testforFunctionalCheckbox();
	}
	
	@Test(description="to verify the Automation Checkbox functionality")
	public void  toVerifyAutomationCheckbox()
	{
		test = new SampleTest(driver);
		test.testforAutomationCheckbox();
	}
	
	@Test(description="to verify the Manual Checkbox functionality")
	public void  toVerifyManualCheckbox()
	{
		test = new SampleTest(driver);
		test.testforManualCheckbox();
	}
	
	@Test(description="to verify the multiple Selection of Checkboxes Approach1")
	public void  toVerifymultipleCheckboxA1()
	{
		test = new SampleTest(driver);
		test.testforMultipleSelectCheckBox();
	}
	
	/*@Test(description="to verify the multiple Selection of Checkboxes Approach2")
	public void  toVerifymultipleCheckboxA2()
	{
		test = new SampleTest(driver);
		test.testforMultiSelectCheckBox();
	}*/
	
	@Test(description="to verify Education Radio button")
	public void  toVerifyEducation()
	{
		test = new SampleTest(driver);
		test.testforEducation();
	}
	
	@Test(description="to verify Alert")
	public void  toVerifyAlert()
	{
		test = new SampleTest(driver);
		test.testforAlert();
	}
	
	@Test(description="to verify comment Accepts Text")
	public void  toVerifyComment()
	{
		test = new SampleTest(driver);
		test.testforComment("hsdoucaUOWeupgF9YUFOIqupwufp qiwf[0diqwufufoiaheocSBDVKBisiurgfowh	oeflwnsvjbWJB");
	}
	
	
	@Test(description = "to verify the whole form")
	public void toVerifyAll()
	{
		test = new SampleTest(driver);
//		test.testForUploadButton();
		test.testForNameEmailAndWebsite("john", "john@mail.com", "www.john.com");
		test.testforExperienceDropdown();
		test.testforMultipleSelectCheckBox();
		
		test.testforComment("you are a good person");
	}
}
