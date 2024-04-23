package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationBookStoreTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		
		String strPlaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
		
		Thread.sleep(3000);
		
		WebElement closeicon = driver.findElement(By.xpath("//a[text()='Clear text']"));
		
		if(closeicon.isDisplayed()) {
			closeicon.click();
		}
	}

}
