package pageEvent;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.FirstStep;


public class DialogBox implements FirstStep {

	WebDriver driver;
    WebDriverWait wait;
    Logger log;
	
	@FindBy(css=frame)
	
	public WebElement iframe;
	
	@FindBy(xpath=dialogbox)
	public WebElement box;
	
	@FindBy(css=Content)
	public WebElement cont;
	
	@FindBy(xpath=usename)
	public WebElement user;
	
	@FindBy(xpath=email)
	public WebElement mail;
	
	@FindBy(xpath=password)
	public WebElement pass;
	
	@FindBy(xpath=createButton)
	public WebElement createbtn;
	
	public DialogBox(WebDriver driver) {
	    this.driver = driver;
	    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	    this.log = LogManager.getLogger(DialogBox.class);
	    PageFactory.initElements(driver, this);
	}
	
	public void enterIntoDialogBox() throws InterruptedException
	{
		log.info("test for dialog Box");
//		wait.until(ExpectedConditions.visibilityOf(iframe));
		Thread.sleep(10000);
		driver.switchTo().frame(iframe);
		log.info("switched into iframe");
		box.click();
		wait.until(ExpectedConditions.visibilityOf(cont));
		driver.switchTo().activeElement();
        user.sendKeys("john");
        mail.sendKeys("john@gmail.com");
        pass.sendKeys("hell");
        createbtn.click();
        log.info("Entered form details");
 
		String expectedUrl = "https://www.globalsqa.com/demo-site/dialog-boxes/";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
		
	}
}
