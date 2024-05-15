package pageEvent;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import pageObject.SecondStep;

public class SelectElements implements SecondStep {
	
	WebDriver driver;
	
	@FindBy(xpath = frame)
	public WebElement iframe;
	
	@FindBys({
		@FindBy(xpath=Selectchild1),
		@FindBy(xpath=Selectchild2),
		@FindBy(xpath=Selectchild3),
		@FindBy(xpath=Selectchild4),
		@FindBy(xpath=Selectchild5),
		@FindBy(xpath=Selectchild6),
		@FindBy(xpath=Selectchild7)
	})
	public List<WebElement> select;
	
	public SelectElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void toSelectMutiEelement()
	{
		driver.switchTo().frame(iframe);
		
		Actions act   =new Actions(driver);
		act.keyDown(Keys.CONTROL);
		for (WebElement element : select) {
            act.click(element);
        }
        
        act.keyUp(Keys.CONTROL);
        act.perform();
	}

}