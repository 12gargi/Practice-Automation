package pageEvent;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObject.LastStep;

public class SampleTest implements LastStep {
	
	WebDriver driver;
	Logger log;
	
	@FindBy(xpath = uploadButton)
	public WebElement upload;
	
	@FindBy(xpath = Name)
	public WebElement name;
	
	@FindBy(xpath = email)
	public WebElement mail;
	
	@FindBy(xpath = website)
	public WebElement site;
	
	@FindBy(xpath=Experience)
	public WebElement exp;
	
	@FindBy(xpath=FunctionalTesting)
	public WebElement functional;
	
	@FindBy(xpath=AutomationTesting)
	public WebElement automation;
	
	@FindBy(xpath=ManualTesting)
	public WebElement manual;
	
	@FindBy(xpath=Education)
	public WebElement educate;
	
	@FindBy(xpath=Alertbutton)
	public WebElement alert;
	
//	@FindBy(xpath=multiSelectCheckBox)
//	public WebElement multi;
	
	@FindBys({ @FindBy(xpath = FunctionalTesting ), @FindBy(xpath =AutomationTesting),
		       @FindBy(xpath = ManualTesting)
		 })
	public List<WebElement> multi;
	
	@FindBy(xpath = comment)
	public WebElement text;
	
	@FindBy(xpath = Submit)
	public WebElement sub;
	
	
	public SampleTest(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void testForUploadButton()
	{
		String path = "C:\\Users\\TESTRIG\\Pictures\\defect.png";
		upload.sendKeys(path);
		
		try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		String uploadedFileName = upload.getAttribute("value");
        Assert.assertTrue(uploadedFileName.endsWith("defect.png"),"File upload failed");

	}
	
	
	
	
	public void testForNameEmailAndWebsite(String namee,String maill,String web)
	{
		name.sendKeys(namee);
		mail.sendKeys(maill);
		site.sendKeys(web);
	}
	
	public void testforExperienceDropdown()
	{
		Select select =new Select(exp);
		select.selectByValue("7-10");
		
		String sel = select.getFirstSelectedOption().getText();
		System.out.println(sel);
		Assert.assertEquals(sel,"7-10","Correct option selected" );
	}
	
	public void testforFunctionalCheckbox()
	{
		functional.click();
	}
	
	public void testforMultipleSelectCheckBox()
	{
		WebElement [] elementtoselect = {functional,automation,manual};
		for(WebElement ele : elementtoselect )
		{
			ele.click();
			
		}
		assertCheckBoxSelected(functional);
        assertCheckBoxSelected(automation);
        assertCheckBoxSelected(manual);
	}
	

    private static void assertCheckBoxSelected(WebElement checkBox) {
        
        Assert.assertTrue(checkBox.isSelected(),"Checkbox is not selected");
    }
	
	
	public void testforAutomationCheckbox()
	{
		automation.click();
	}
	
	public void testforManualCheckbox()
	{
		manual.click();
	}
	
	public void testforEducation()
	{
		educate.click();
	}
	
	public void testforAlert()
	{
		alert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		al.accept();
		Assert.assertFalse(isAlertPresent(driver),"Alert is still present");
	}
	
	private static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	
	public void testforComment(String para)
	{
		text.click();
		text.clear();
		text.sendKeys(para);
	}
	
	public void testforSubmitButton()
	{
		sub.click();
	}

}
