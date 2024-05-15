package pageEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObject.ThirdStep;

public class Sortable implements ThirdStep{
	
	WebDriver driver;
	
	@FindBy(xpath = sortframe)
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
		PageFactory.initElements(driver, this);
	}
	
	
	public void testForSortshoppingAndfeed()
	{
	    driver.switchTo().frame(iframe);
        Actions action = new Actions(driver);
        action.clickAndHold(shop).moveToElement(feed).release().build().perform();

	}
	
	

}
