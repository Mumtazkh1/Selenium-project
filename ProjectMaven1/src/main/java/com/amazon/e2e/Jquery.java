package com.amazon.e2e;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jquery {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}


@Test
public void mouseHover() {
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/iframe")));
	WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	driver.switchTo().frame(frame);
	
	WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	Actions action = new Actions(driver);

	action.dragAndDropBy(source,100,100).build().perform();
	

	
	
	
	
}
}