package com.amazon.e2e;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAlert {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("file:///D:/development%20content/automation/automation%20doc/SelectSite.html");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Test
	public void testAlert() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=\'Click me\']")).click();
		// Alert alert = new Alert();
		Thread.sleep(3000);
	    Alert alert = driver.switchTo().alert();
	    String alerttext = alert.getText();
		
	   Assert.assertEquals(alerttext, "This is an alert dialog box");
		
		alert.accept();		
	}
	 
	
	
	
}
