package com.newgen.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
import com.newgen.pages.HomePage;

public class TestHomePage {
	WebDriverWait wait ;
	WebDriver driver ;
	HomePage homepage;
	Select select;
	
	
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
	 //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshersworld.com/");	
		driver.manage().window().maximize();
	 homepage = new HomePage(driver);
		
	
	}
	
	@Test
	public void testNewRegistration() {
	homepage.fillNewRegistration("mumtaz","khan","mumtaz@123gmail.com","password","843966666");
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'select2-currentCity-container\']")); 
	  select = new Select(dropdown);
	 select.selectByVisibleText("Delhi");
	}
}
