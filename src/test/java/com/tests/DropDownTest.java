package com.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.DropDown;
import utils.Routes;

public class DropDownTest extends BaseTest {

    DropDown down;
    
    @Test(description = "Test for Validation of DropDown")
    public void testForDropDowselection() {
        
        startUp(Routes.DropDown);
        
        down = new DropDown(driver);
        down.testForDropdown();
    }
}
