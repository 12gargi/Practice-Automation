package pageEvent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.FirstStep;
import pageObject.SecondStep;

public class AccordionsAndTabs implements SecondStep {
 
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = AccordFrame)
	public WebElement Aframe;
	
	@FindBy(xpath=AccordionHeader)
	public WebElement header;
	
	public AccordionsAndTabs(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		PageFactory.initElements(driver, this);
	}
	
      
      public void switchToAframe() {
    	  
    	  wait.until(ExpectedConditions.visibilityOf(Aframe));
          driver.switchTo().frame(Aframe);
      }

      public void accordionsIsWorking() throws InterruptedException 
      {
    	        switchToAframe();
    	        wait.until(ExpectedConditions.visibilityOf(header));
    	        List<WebElement> allHeaders = header.findElements(By.cssSelector(".ui-accordion-header"));
    	        for (WebElement header : allHeaders) {
    	            scrollToElement(header);
    	            new Actions(driver).click(header).build().perform();
    	        }
    	        driver.switchTo().defaultContent();
    	    }
      private void scrollToElement(WebElement element) {
          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
      }
}

