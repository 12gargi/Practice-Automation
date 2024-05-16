package pageEvent;

import java.time.Duration;

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
	
	@FindBy(xpath=frame)
	
	public WebElement iframe;
	
	@FindBy(css=dialogbox)
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
	    PageFactory.initElements(driver, this);
	}
	
	public void enterIntoDialogBox()
	{
		wait.until(ExpectedConditions.visibilityOf(iframe));
		driver.switchTo().frame(iframe);
		box.click();
		wait.until(ExpectedConditions.visibilityOf(cont));
		driver.switchTo().activeElement();
        user.sendKeys("john");
        mail.sendKeys("john@gmail.com");
        pass.sendKeys("hell");
        createbtn.click();
 
		String expectedUrl = "https://www.globalsqa.com/demo-site/dialog-boxes/";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
		
	}
}
