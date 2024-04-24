package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//Switch from mainpage to frame1
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pranitha AVula");
		
		//Switch from frame1 to frame3
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		
		//Switch from frame3 to mainpage
		driver.switchTo().defaultContent();
		
		//Switch from mainpage to frame2
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//option[text()='Avatar']")).click();
		
	}

}
