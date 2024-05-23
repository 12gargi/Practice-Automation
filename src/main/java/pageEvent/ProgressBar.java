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

public class ProgressBar implements FirstStep{

	WebDriver driver;
	WebDriverWait wait;
	Logger log;
	
    @FindBy(css=frameProgress)
	
	public WebElement iframe;
    
    @FindBy(xpath = downloadButton)
    public WebElement btn;
    
    @FindBy(css = FileDownload)
    public WebElement FileD;
    
    @FindBy(css = Progress)
    public WebElement prog;
    
    @FindBy(xpath = close)
    public WebElement closebtn;
    
    
    public ProgressBar(WebDriver driver) {
	    this.driver = driver;
	    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	    this.log = LogManager.getLogger(ProgressBar.class);
	    PageFactory.initElements(driver, this);
	    
	}
    
    public void ProgressBarButtonVerification(WebDriver driver) throws InterruptedException {
    	
//    	wait.until(ExpectedConditions.visibilityOf(iframe));
    	log.info("Test for ProgressBar Button");
    	Thread.sleep(10000);
    	driver.switchTo().frame(iframe);
    	log.info("switched into iframe");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    	btn.click();
    	
    	Assert.assertTrue(FileD.isDisplayed(), "Image is not displayed");
    	
    }
    
    public void ProgressBarcompletes100Percent() {
    	log.info("Test for ProgressBar completion");
        try {
//        	wait.until(ExpectedConditions.visibilityOf(iframe));
        	Thread.sleep(10000);

            driver.switchTo().frame(iframe);

            btn.click();

            wait.until(ExpectedConditions.visibilityOf(iframe));

            wait.until(ExpectedConditions.textToBePresentInElement(prog, "100%"));

            Assert.assertEquals(prog.getText(), "Complete!", "Progress bar did not reach 100%");
        } catch (Exception e) {
            
            System.out.println("Exception occurred: " + e.getMessage());
            Assert.fail("Failed to complete progress bar to 100%");
        } finally {

            driver.switchTo().defaultContent();
        }
        
        closebtn.click();
    }


}

