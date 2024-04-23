package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
//		WebElement searchbox = driver.findElement(By.cssSelector("#APjFqb"));
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		
		searchbox.sendKeys("Avula Pranitha");
		
		searchbox.sendKeys(Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}

