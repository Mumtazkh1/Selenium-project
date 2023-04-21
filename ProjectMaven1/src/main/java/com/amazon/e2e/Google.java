package com.amazon.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://admissions.invertisuniversity.ac.in/?source=CTPL_Google&medium=INVERTIS_BRANDED_2023&campaignid=19630425529&extensionid=&device=c&gclid=Cj0KCQjwxYOiBhC9ARIsANiEIfZaByNjF8jvCQKGoAIYGY2Hcw5neZsAz-yhA2F6-Fmz0Ghc9rfDWioaArZKEALw_wcB&keyword=invertis&placement=&adposition=&gclid=Cj0KCQjwxYOiBhC9ARIsANiEIfZaByNjF8jvCQKGoAIYGY2Hcw5neZsAz-yhA2F6-Fmz0Ghc9rfDWioaArZKEALw_wcB");
		driver.manage().window().maximize();
	}

	@Test
	public void search() {

		driver.findElement(By.xpath("//*[@id='dataFormRegistration']/div/input")).click();
		
      
	
		
		
	
		}
	}


