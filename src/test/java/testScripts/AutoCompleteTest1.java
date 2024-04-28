package testScripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTest1 {
	
	public static final String expValue = "Java";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/autocomplete/");
		
		//Switch from mainpage to frame
		driver.switchTo().frame(0);
		
		WebElement tagbox = driver.findElement(By.xpath("//input[@id='tags']"));
		tagbox.sendKeys("a");
		Thread.sleep(3000);
//		WebElement item = driver.findElement(By.xpath("//div[@id='ui-id-33']")); 
//		WebElement item = driver.findElement(By.xpath("//li[@class='ui-menu-item']//following-sibling::li[2]"));
//		System.out.println(item.getText());
//		item.click();
		
		List <WebElement> items = driver.findElements(By.xpath("//li[@class='ui-menu-item']//following-sibling::li"));
		System.out.println("No. of items=" +items.size());
		
		for (WebElement result : items) {
			//To get the text of each item
			System.out.println(result.getText());
			// TO select expected value
			if(result.getText().equalsIgnoreCase(expValue)) {
				result.click();
		        break;
			}

		}

	}

}
