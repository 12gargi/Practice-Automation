package pageEvent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.SecondStep;

public class DropDown implements SecondStep{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = dropDown)
	public WebElement drop;
	
	public DropDown(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public void testForDropdown() throws InterruptedException
    {
		Thread.sleep(5000);
//	    wait.until(ExpectedConditions.visibilityOf(drop));
        Select sel = new Select(drop);
        sel.selectByVisibleText("Falkland Islands (Malvinas)");
     
        String selectedOption = sel.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "Falkland Islands (Malvinas)", "Dropdown selection doesn't match expected");
    }
	
	

}
