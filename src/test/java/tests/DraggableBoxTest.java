package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.DraggableBox;


public class DraggableBoxTest extends BaseTest{

	DraggableBox Dbox;
	
	@Test(description = "to verify whether the box movable")
	public void testforDraggableBox()
	{
		Dbox =new DraggableBox(driver);
		Dbox.testDraggableBox();
	}
}
