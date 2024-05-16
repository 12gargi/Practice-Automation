package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.Sortable;

public class SortableTest extends BaseTest {
	
	Sortable sort;
	
	@Test(description = "To verfiy if interchange of feed's And Shopping's position is possible ")
	public void ToTestShoppingAndFeedsPositions() throws InterruptedException
	{
		sort = new Sortable(driver);
		sort.testForSortshoppingAndfeed();
	}

}
