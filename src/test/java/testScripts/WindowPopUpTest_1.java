package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpTest_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		String parentWindow = driver.getWindowHandle();   //parent window
		System.out.println("Parent Window:"  + parentWindow);
    	driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
    	
    	Set <String> tabs = driver.getWindowHandles();
    	for (String child : tabs) {
    		if(!child.equalsIgnoreCase(parentWindow)) {
    			driver.switchTo().window(child);
    			System.out.println("Child window:"  + child);
    		}
    	}
    	Thread.sleep(3000);
    	driver.close();
    	
    	driver.switchTo().window(parentWindow);
    	Thread.sleep(3000);
    	driver.switchTo().newWindow(WindowType.WINDOW);
    	driver.navigate().to("https://github.com/pavulas/webdriverSamples");
    	System.out.println(driver.getWindowHandle());
    	Thread.sleep(3000);
     	driver.close();
    	
		

	}

}
