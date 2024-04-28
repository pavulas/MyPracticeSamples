package TestNGScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class PriorityOrderTest1 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	}
	@Test(alwaysRun = true ,dependsOnMethods = "SeleniumSearchTest")
	  public void javaSearchTest() { driver.get("https://www.google.com/");
	WebElement srcbox = driver.findElement(By.id("APjFqb"));
	srcbox.sendKeys("Java Tutorial");
	srcbox.sendKeys(Keys.ENTER);
	System.out.println("Page Title:" +driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
  }
  @Test
  public void SeleniumSearchTest() {
	driver.get("https://www.google.com/");
	WebElement srcbox = driver.findElement(By.id("APjFqb"));
	srcbox.sendKeys("Selenium Tutorial");
	srcbox.sendKeys(Keys.ENTER);
	System.out.println("Page Title:" +driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
  }
  @Test(enabled=false)
  public void CucumberSearchTest() {
	driver.get("https://www.google.com/");
	WebElement srcbox = driver.findElement(By.id("APjFqb"));
	srcbox.sendKeys("Cucumber Tutorial");
	srcbox.sendKeys(Keys.ENTER);
	System.out.println("Page Title:" +driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Cucumber Tutorial - Google Search");
  }
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
  
}
