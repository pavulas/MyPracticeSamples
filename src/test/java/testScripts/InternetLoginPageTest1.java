package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetLoginPageTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		
		WebElement loginbx = driver.findElement(By.xpath("//button[@class='radius']"));
		loginbx.submit();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
		

	}

}
