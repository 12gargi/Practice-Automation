package pageEvent;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.SecondStep;

public class SelectElements implements SecondStep {

	WebDriver driver;
	WebDriverWait wait;
	Logger log;

	@FindBy(css = frame)
	public WebElement iframe;

	@FindBys({ @FindBy(xpath = Selectchild1), @FindBy(xpath = Selectchild2), @FindBy(xpath = Selectchild3),
			@FindBy(xpath = Selectchild4), @FindBy(xpath = Selectchild5), @FindBy(xpath = Selectchild6),
			@FindBy(xpath = Selectchild7) })
	public List<WebElement> select;

	public SelectElements(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		this.log = LogManager.getLogger(SelectElements.class);
		PageFactory.initElements(driver, this);

	}

	public void toSelectMutiEelement() throws InterruptedException {
		log.info("test for Multiple element Selection");
//		 wait.until(ExpectedConditions.visibilityOf(iframe));
		Thread.sleep(10000);
		driver.switchTo().frame(iframe);

		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		for (WebElement element : select) {
			act.click(element);
		}

		act.keyUp(Keys.CONTROL);
		act.perform();
	}

}