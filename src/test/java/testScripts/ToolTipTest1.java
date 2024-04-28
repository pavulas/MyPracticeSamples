package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.navigate().to("https://jqueryui.com/tooltip/");
		
		//Switch from mainpage to frame
		driver.switchTo().frame(0);
		WebElement textbox = driver.findElement(By.id("age"));
		textbox.sendKeys(Keys.PAGE_DOWN);
		actions.moveToElement(textbox).click();
		
		String text = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		System.out.println("Text displayed on hover is:" +text);
		
		textbox.sendKeys("24");

	}

}
