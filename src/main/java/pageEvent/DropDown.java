package pageEvent;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	Logger log;
	
	@FindBy(xpath = dropDown)
	public WebElement drop;
	
	public DropDown(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.log = LogManager.getLogger(DropDown.class);
		PageFactory.initElements(driver, this);
	}
	
	public void testForDropdown() throws InterruptedException
    {
		log.info("test for Dropdown");
		Thread.sleep(2000);
//	    wait.until(ExpectedConditions.visibilityOf(drop));
        Select sel = new Select(drop);
        sel.selectByVisibleText("Falkland Islands (Malvinas)");
        log.info("DropDown option selected");
     
        String selectedOption = sel.getFirstSelectedOption().getText();
        System.out.println(selectedOption);
        Assert.assertEquals(selectedOption, "Falkland Islands (Malvinas)", "Dropdown selection does match expected");
        log.info("Assertion Applied");
    }
	
	

}
