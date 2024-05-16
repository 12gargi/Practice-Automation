package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.DialogBox;


public class DialogBoxTest extends BaseTest {
	DialogBox box;

	 @Test(description = "test to verify modal dialog box")
	 public void ToEnterdialogBox()
	 {
		 //startUp(Routes.dialogbox);
		 box =new DialogBox(driver);
		 box.enterIntoDialogBox();
	 }
}
