package com.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.DropDown;
import utils.Routes;

public class DropDownTest extends BaseTest {

    DropDown dropdown;
    
    @Test(description = "Test for Validation of DropDown")
    public void testForDropDowselection() {
        
       // startUp(Routes.DropDown);
        
        dropdown = new DropDown(driver);
        dropdown.testForDropdown();
    }
}
