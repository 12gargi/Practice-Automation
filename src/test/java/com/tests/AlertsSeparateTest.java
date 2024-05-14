package com.tests;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSeparateTest {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		
		WebElement button =driver.findElement(By.id("alertexamples"));
		button.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		 
		String alertMessage= alert.getText();
		System.out.println(alertMessage);
		 
		 driver.quit();
		
	}
}
