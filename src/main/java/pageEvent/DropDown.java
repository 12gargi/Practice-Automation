package pageEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObject.SecondStep;

public class DropDown implements SecondStep{
	
	WebDriver driver;
	
	@FindBy(xpath = dropDown)
	public WebElement drop;
	
	public DropDown(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void testForDropdown()
    {
        Select sel = new Select(drop);
        sel.selectByVisibleText("Falkland Islands (Malvinas)");
     
        String selectedOption = sel.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "Falkland Islands (Malvinas)", "Dropdown selection doesn't match expected");
    }
	
	

}
