package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/shadowdom");
		
		WebElement shadowHost = driver.findElement(By.xpath("(//my-paragraph)[1]"));
		
		SearchContext sdwroot = shadowHost.getShadowRoot();
		WebElement result = sdwroot.findElement(By.cssSelector("slot[name='my-text']"));
		
		System.out.println(result.getText());
		

	}

}
