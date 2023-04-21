package com.amazon.e2e;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindLink {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}
	
	@Test
	public void findbBrokenUrl() {
		
	List<WebElement> list =	driver.findElements(By.xpath("//a"));
	
	
	for (WebElement webElement : list) {
		String url = webElement.getAttribute("href");
		System.out.println(url);
		
	}
	
	
	
	}
	
	

}
