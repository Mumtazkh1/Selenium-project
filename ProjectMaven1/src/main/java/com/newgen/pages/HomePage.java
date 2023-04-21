package com.newgen.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.newgen.object.LocatorObjectRepository;

public class HomePage implements LocatorObjectRepository {

	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void fillNewRegistration(String firstname, String lastname, String email, String pass, String mobile) {
		driver.findElement(By.linkText(homepage_register)).click();
		driver.findElement(By.name(homepage_firstname)).sendKeys(firstname);
		driver.findElement(By.name(homepage_lastname)).sendKeys(lastname);
		driver.findElement(By.id(homepage_emailid)).sendKeys(email);
		driver.findElement(By.name(homepage_password)).sendKeys(pass);
		driver.findElement(By.name(homepage_mobile)).sendKeys(mobile);
		driver.findElement(By.xpath("//*[@id=\"select2-currentCity-container\"]")).click();
	}
	
}
