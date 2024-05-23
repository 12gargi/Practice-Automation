package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.Toolbar;

public class ToolBarTest extends BaseTest {
	
	Toolbar tool;
	
	@Test(description = "to verify the hovered message of a Print Button")
	public void verifyPrintButtonMessage() throws InterruptedException
	{
		tool = new Toolbar(driver);
		tool.printMessage();
	}
	
	@Test(description = "to verify the hovered message of a Redo Button")
	public void verifyRedoButtonMessage() 
	{
		tool = new Toolbar(driver);
		tool.redoMessage();
	}
	
	/*@Test(description = "to verify the hovered message of a Undo Button")
	public void verifyUndoButtonMessage() 
	{
		tool = new Toolbar(driver);
		tool.undoMessage();
	}*/
	
	/*@Test(description = "to verify zoom dropdown works as expected")
	public void verifyZoomDropdown() throws InterruptedException 
	{
		tool = new Toolbar(driver);
		tool.zoomDropdown();
	}*/

}
