package com.amazon.e2e;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LaunchChrome {
	WebDriver driver;
	
	@BeforeClass
    public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("file:///D:/development%20content/automation/automation%20doc/MyTestingSite.html");
		driver.manage().window().maximize();
 
		
		
	}
	
	
	@Test
public void fillForm() {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Mumtazkh1");
		driver.findElement(By.id("firstname")).sendKeys("Mumtaz");
		driver.findElement(By.id("lastname")).sendKeys("khan");
		driver.findElement(By.id("detail")).sendKeys("I am a QA");
		driver.findElement(By.xpath("//input[@attri='id123_xyz']")).sendKeys("mumtazkh1@gmail.com");
// absolute_xpath		driver.findElement(By.xpath("/html/body/div[1]/form/input[5]")).sendKeys("mumtazkh1@gmail.com");
		
		driver.findElement(By.name("psw")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='female']")).click();
		
}
	
	
	
	
	
//  public void launchingChrome() {
//	WebDriverManager.chromedriver().setup();
//  ChromeDriver driver= new ChromeDriver();
//	FirefoxDriver driver1= new FirefoxDriver();
//	driver.get("https://www.wikipedia.org/");
//  driver.close();
//  }

}
