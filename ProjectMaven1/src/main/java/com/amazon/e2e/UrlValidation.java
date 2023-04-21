package com.amazon.e2e;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UrlValidation {
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
	public void findbBrokenUrl() throws Exception {
		
	List<WebElement> list =	driver.findElements(By.xpath("//a"));
	
	
	for (WebElement webElement : list) {
		String url = webElement.getAttribute("href");
	
		HttpURLConnection request= (HttpURLConnection) (new URL(url).openConnection());
		request.setRequestMethod("HEAD");
		request.connect();
		int responsecode = request.getResponseCode();
		
		if(responsecode >= 400) {
			System.out.println("is a broken link "+url);
			throw new Exception("broken link");
		}
		else {
			System.out.println("is a valid link "+url);
			
		}
			
		}
		
		
	}
	
	

}
