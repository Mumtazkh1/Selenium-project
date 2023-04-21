package com.amazon.e2e;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium {

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
	public void search() {

		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("selenium" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).click();
		driver.findElement(By.className("DocSearch-Button-Placeholder")).click();

		driver.findElement(By.id("docsearch-input")).sendKeys("Grid");
		// driver.findElement(By.xpath("//*[@id=\"docsearch-item-0\"]/a/div/div[2]/span/mark")).click();
		// Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mark[text()='Grid']")));
		driver.findElement(By.xpath("//mark[text()='Grid']")).click();

		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, "https://www.selenium.dev/documentation/grid/");

		driver.navigate().refresh();
		driver.navigate().back();
		actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, "https://www.selenium.dev/");

		driver.navigate().to("https://www.google.com/");
	}

}
