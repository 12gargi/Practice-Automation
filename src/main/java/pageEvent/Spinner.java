package pageEvent;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.ThirdStep;

public class Spinner implements ThirdStep{
	
	WebDriver driver;
	WebDriverWait wait;
	Logger log;
	
	@FindBy(css = spinerframe)
	public WebElement iframe;
	
	@FindBy(xpath = spinnerInput)
	public WebElement input;
	
	@FindBy(xpath = currencyDropdown)
	public WebElement dropdown;
	
	@FindBy(xpath = upArrow)
	public WebElement uparrow;
	
	@FindBy(xpath = downArrow)
	public WebElement downarrow;
	
	
	public Spinner(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.log = LogManager.getLogger(Spinner.class);
		PageFactory.initElements(driver, this);
	}
	
	public void toVerifySpinner() throws InterruptedException
	{
		log.info("test for Spinner");
//		wait.until(ExpectedConditions.visibilityOf(iframe));
		Thread.sleep(2000);
       driver.switchTo().frame(iframe);
		
        for (int i = 0; i < 3; i++) {
            uparrow.click();
        }

        for (int i = 0; i < 2; i++) {
            downarrow.click();
        }

        Select select = new Select(dropdown);
        select.selectByVisibleText("US $");

        String selectedCurrency = select.getFirstSelectedOption().getText();
        if (selectedCurrency.equals("US $")) {
            System.out.println("Currency selected successfully: " + selectedCurrency);
        } else {
            System.out.println("Currency selection failed");
        }

        driver.quit();
    }
	}


