package pageEvent;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObject.ThirdStep;

public class Toolbar implements ThirdStep {

	WebDriver driver;
	WebDriverWait wait;
	Logger log;
	
	@FindBy(css =toolbarframe)
	public WebElement iframe; 
	
	@FindBy(xpath = Printbutton)
	public WebElement print;
	
	@FindBy(xpath = redobutton)
	public WebElement redo;
	
	@FindBy(xpath = undobutton)
	public WebElement undo;
	
	@FindBy(xpath = zoomdropdown)
	public WebElement zoom;
	
	@FindBy(xpath = zoomOptions)
	public WebElement zoomOtp;
	
	public Toolbar(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		this.log = LogManager.getLogger(Toolbar.class);
		PageFactory.initElements(driver, this);
	}
	
	public void printMessage() throws InterruptedException
	{
		log.info("test for toolbar print button");
		driver.switchTo().frame(iframe);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		action.moveToElement(print).perform();
		String hovertext = print.getText();
		System.out.println(hovertext);
	    Assert.assertEquals(hovertext,"Print");
	}
	
	public void redoMessage()
	{
		log.info("test for toolbar Redo button");
		driver.switchTo().frame(iframe);
		Actions action =new Actions(driver);
		action.moveToElement(redo).perform();
	    String message = redo.getText();
//	    System.out.println("Redo message: " + message); 
	    Assert.assertEquals(message, "Redo");
	}
	
	
	public void undoMessage()
	{
		log.info("test for toolbar Undo button");
		driver.switchTo().frame(iframe);
		Actions action = new Actions(driver);
		action.moveToElement(undo).perform();
		String undomsg = undo.getText();
		Assert.assertEquals(undomsg, "Undo");
	}
	
	public void zoomDropdown() throws InterruptedException {
		log.info("test for toolbar zoom dropdown");
	    driver.switchTo().frame(iframe);
	    wait.until(ExpectedConditions.visibilityOf(zoom));
	    zoom.click();
	    Thread.sleep(2000);
  
	    List<WebElement> options = driver.findElements(By.xpath(zoomOptions));
	    boolean foundvalue =false;
	    for (WebElement option : options) {
	        if (option.getText().equals("90%")) {
	            option.click();
	            foundvalue = true;
	            Assert.assertEquals(option.getText(),"90%");
	            System.out.println(option.getText());
	            break;
	        }
	    }
	    Assert.assertTrue(foundvalue, "90% option found in the zoom dropdown");
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

