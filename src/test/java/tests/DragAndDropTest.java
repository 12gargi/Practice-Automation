package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.DragAndDrop;

public class DragAndDropTest extends BaseTest {
	DragAndDrop drag;
	
	@Test(description = "to verify drag and drop on first image ")
	public void testForfirsttoDragAndDrop() throws InterruptedException
	{
	    drag = new DragAndDrop(driver);
	    drag.testForFirstToDraginTrash();
	 
	}
	
	@Test(description = "to verify drag and drop on Second image ")
	public void testForSecondtoDragAndDrop() throws InterruptedException
	{
	    drag = new DragAndDrop(driver);
	    drag.testForSecondToDraginTrash();
	   
	}
	
	@Test(description = "to verify drag and drop on Third image ")
	public void testForThirdtoDragAndDrop() throws InterruptedException
	{
	    drag = new DragAndDrop(driver);
	    drag.testForThirdToDragInTrash();

	}
	
	@Test(description = "to verify drag and drop on first image ")
	public void testForforthtoDragAndDrop() throws InterruptedException
	{
	    drag = new DragAndDrop(driver);
	    drag.testForForthToDragInTrash();
	}
	
	/*@Test(description = "to verify drag and drop works as expected")
	public void testForAlltoDragAndDrop() throws InterruptedException
	{
	    drag = new DragAndDrop(driver);
	    drag.testForAllToDragInTrash();
	}*/

}
