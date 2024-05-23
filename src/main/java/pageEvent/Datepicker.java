package pageEvent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObject.ThirdStep;

public class Datepicker implements ThirdStep {
	WebDriver driver;
	Logger log;
	
	@FindBy(xpath=dateinput)
	public WebElement date;
	
	@FindBy(css = dateFrame)
	public WebElement iframe;
	
	@FindBy(xpath=daterow)
	public WebElement drow;
	
	@FindBy(css = datebox)
	public WebElement box;
	
    @FindBy(xpath = datecol)
    public WebElement column;
    
	
	public Datepicker(WebDriver driver)
	{
		this.driver = driver;
		this.log = LogManager.getLogger(Datepicker.class);
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyDatepicker() throws InterruptedException {
	    log.info("test for datepicker");
	    driver.switchTo().frame(iframe);
	    Thread.sleep(4000);
	    date.click();
	    
	    DateFormat dateFormat = new SimpleDateFormat("dd");
	    String today = dateFormat.format(new Date());
	    
	    List<WebElement> rows = box.findElements(By.xpath(daterow));
	    
	    for (WebElement row : rows) {
	        List<WebElement> cells = row.findElements(By.xpath(datecol));
	        for (WebElement cell : cells) {
	            if (cell.getText().equals(today)) {
	                cell.click();
	                Thread.sleep(4000);
	                System.out.println("Selected date: " + today);
	                return;
	            }
	        }
	    }
	}



}
