package pageEvent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObject.FirstStep;

public class AccordionsAndTabs implements FirstStep {
 
	
	WebDriver driver;
	
	@FindBy(xpath = AccordFrame)
	public WebElement Aframe;
	
	@FindBy(xpath=Accordions)
	public WebElement accordions;
	
	public AccordionsAndTabs(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
      
      public void switchToAframe() {
          driver.switchTo().frame(Aframe);
      }

      public void accordionsIsWorking() throws InterruptedException {
          switchToAframe();
          List<WebElement> allLinks = accordions.findElements(By.cssSelector(".ui-accordion-header"));
          for (WebElement header : allLinks) {
              scrollToElement(header);
              new Actions(driver).click(header).build().perform();
              Thread.sleep(2000);
          }
          driver.switchTo().defaultContent();
      }
      private void scrollToElement(WebElement element) {
          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
      }
}

