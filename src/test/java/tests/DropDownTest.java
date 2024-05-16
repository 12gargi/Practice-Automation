package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.DropDown;


public class DropDownTest extends BaseTest {

    DropDown dropdown;
    
    @Test(description = "Test for Validation of DropDown")
    public void testForDropDowselection() throws InterruptedException {
        
       // startUp(Routes.DropDown);
        
        dropdown = new DropDown(driver);
        dropdown.testForDropdown();
    }
}
