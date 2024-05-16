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

public class Slider implements FirstStep {

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = Sliderframe)
	public WebElement frame;

	@FindBy(xpath=redScanner)
	public WebElement red;
	
	@FindBy(css=blueScanner)
	public WebElement blue;

	public Slider(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}

	public void SliderCanSlide() {
		
		wait.until(ExpectedConditions.visibilityOf(frame));
        driver.switchTo().frame(frame);
		String sliderPosition = red.getAttribute("style");
		if (sliderPosition.contains("left: 100%")) {
			System.out.println("Slider is already at 100%");
		} else {

			Actions actions = new Actions(driver);
			actions.dragAndDropBy(red, -100, 0).build().perform();

			sliderPosition = red.getAttribute("style");
			Assert.assertTrue(sliderPosition.contains("left: 0%"), "Slider is not at 0%");
			System.out.println("Slider moved to 0% successfully");
		}

	}


}
