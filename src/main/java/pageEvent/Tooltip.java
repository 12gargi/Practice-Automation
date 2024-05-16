package pageEvent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.FirstStep;

public class Tooltip implements FirstStep {
	WebDriver driver ;
    WebDriverWait wait;
	@FindBy(css = texttooltip)
	public WebElement text;
	
	@FindBy(css = ElementWithToolTip)
	public WebElement tool;
	
	@FindBy(xpath = toolFrame)
	public WebElement Frametool;


	public Tooltip(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}

	public void testForToolTip()
	{
         //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
         wait.until(ExpectedConditions.visibilityOf(Frametool));
         driver.switchTo().frame(Frametool);
		 wait.until(ExpectedConditions.visibilityOf(text));

		Actions actions = new Actions(driver);
		actions.moveToElement(text).perform();

		WebElement tooltip = wait.until(ExpectedConditions.visibilityOf(tool));

		Assert.assertTrue(tooltip.isDisplayed());
		Assert.assertTrue(!tooltip.getText().isEmpty());

	}
}
