package pageEvent;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.ThirdStep;

public class Sortable implements ThirdStep{
	
	Logger log;
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css = sortframe)
    public WebElement iframe;
	
	@FindBy(xpath = feeds)
	public WebElement feed;
	
	@FindBy(xpath = shopping)
	public WebElement shop;
	
	@FindBy(xpath = Links)
	public WebElement link;
	
	@FindBy(xpath = News)
	public WebElement news;
	
	
	public Sortable(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.log = LogManager.getLogger(Sortable.class);
		PageFactory.initElements(driver, this);
	}
	
	
	public void testForSortshoppingAndfeed() throws InterruptedException
	{
		log.info("test for Sorting");
//		wait.until(ExpectedConditions.visibilityOf(iframe));
		Thread.sleep(2000);
	    driver.switchTo().frame(iframe);
        Actions action = new Actions(driver);
        action.clickAndHold(shop).moveToElement(feed).release().build().perform();

	}
	
	

}
