package com.amazon.e2e;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown {
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
	public void selectDropDownList() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[@value='dog']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[@value='cat']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[@value='goldfish']")).click();
		
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("pets"));
		Select select= new Select(element);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByVisibleText("Cat");
		Thread.sleep(2000);
		select.selectByValue("hamster");
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
