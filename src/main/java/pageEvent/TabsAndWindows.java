package pageEvent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.SecondStep;

public class TabsAndWindows implements SecondStep{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath =clickHerebtn)
	public WebElement button;
	
	public TabsAndWindows(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public void switchToAnotherTab() throws InterruptedException
	{
        String currentWindowHandle = driver.getWindowHandle(); 
//        wait.until(ExpectedConditions.visibilityOf(button));
        Thread.sleep(2000);
        button.click(); 
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String newUrl = driver.getCurrentUrl(); 
        Assert.assertNotEquals(newUrl, currentWindowHandle);
    }
}
