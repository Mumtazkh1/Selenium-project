package com.amazon.e2e;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WIndowSwitching2 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://www.freecodecamp.org/news/how-to-use-html-to-open-link-in-new-tab/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Test
	public void testWindowSwitching() throws MalformedURLException, IOException {
		String tab1 = driver.getWindowHandle();
		System.out.println("DATA"+tab1);
		driver.findElement(By.xpath("//*[@id=\"site-main\"]/div/article/section/div[1]/section/p[13]/a")).click();
		String title = driver.getTitle();
		
		Set<String> tabs = driver.getWindowHandles();
		tabs.remove(tab1);
		
		String tab2 = (String) tabs.toArray()[0];
		
		driver.switchTo().window(tab2);
		
		
		
		

		
		
	
		
		
       
		
		
	}

}
