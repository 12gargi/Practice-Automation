package pageEvent;



import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.ThirdStep;

public class DraggableBox implements ThirdStep {

	WebDriver driver;
	Logger log;
	WebDriverWait wait;
	
	@FindBy(xpath = Boxiframe)
	public WebElement frame;
	
	@FindBy(xpath = DragBox )
	public WebElement box;
	
	public DraggableBox(WebDriver driver)
	{
		this.driver = driver;
		this.log = LogManager.getLogger(DraggableBox.class);
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}
	
	public void testDraggableBox()
	{
		System.out.println(box.getText());
		wait.until(ExpectedConditions.visibilityOf(box));
        Point initialPosition = box.getLocation();
         
        Actions action = new Actions(driver);
        action.clickAndHold(box).moveByOffset(100, 100).release().perform();
        //action.dragAndDropBy(box, 100, 100);

        Point finalPosition = box.getLocation();

        Assert.assertNotEquals(initialPosition, finalPosition, "Element was not moved.");

        // assert finalPosition.getX() == initialPosition.getX() + 100 : "Element was not moved horizontally.";
        // assert finalPosition.getY() == initialPosition.getY() + 100 : "Element was not moved vertically.";
        
        //Assert.assertEquals(finalPosition.getY(), initialPosition.getY() + 100, "Element was not moved vertically.");
	}
}
