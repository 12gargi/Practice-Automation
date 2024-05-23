package pageEvent;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.ThirdStep;

public class DragAndDrop implements ThirdStep {
	
	WebDriver driver;
	Logger log;
	WebDriverWait wait;

	@FindBy(xpath =dragiframe)
	public WebElement frame;
	
	@FindBy(xpath =listImage)
	public WebElement image;
	
	@FindBy(xpath = SecondPosition)
	public WebElement second;
	
	@FindBy(xpath = FirstPosition)
	public WebElement first;
	
	@FindBy(xpath = ThirdPosition)
	public WebElement third;
	
	@FindBy(xpath = ForthPosition)
	public WebElement forth;
	
	@FindBy(xpath = Trash)
	public WebElement trash;
	
	public DragAndDrop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		this.log = LogManager.getLogger(DragAndDrop.class);
	}
	
	public void testForFirstToDraginTrash() throws InterruptedException
	{
		log.info("test for first element to  drag And Drop");
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		action.clickAndHold(first)
		.moveToElement(trash)
		.release()
		.build()
		.perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public void testForSecondToDraginTrash() throws InterruptedException
	{
		log.info("test for second element to drag And Drop");
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		action.clickAndHold(second)
		.moveToElement(trash)
		.release()
		.build()
		.perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public void testForThirdToDragInTrash() throws InterruptedException
	{
		log.info("test for second element to drag And Drop");
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		action.clickAndHold(third)
		.moveToElement(trash)
		.release()
		.build()
		.perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public void testForForthToDragInTrash() throws InterruptedException
	{
		log.info("test for second element to drag And Drop");
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		action.clickAndHold(forth)
		.moveToElement(trash)
		.release()
		.build()
		.perform();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public void testForAllToDragInTrash() throws InterruptedException
	{
		log.info("test for second element to drag And Drop");
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		
		WebElement[] elementsToDrag = {first, second, third, forth};
		for(WebElement element : elementsToDrag)
		{
			action.dragAndDrop(element, trash)
			.build()
			.perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}


}
