package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaPageTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.lambdatest.com/register");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("avulapranitha555@gmail.com");
//		driver.findElement(By.xpath("(//div[@class='error__border w-full custom__border xls:mt-20 mt-10'])[1]")).sendKeys("avulapranitha555@gmail.com");
		
		driver.findElement(By.cssSelector("#userpassword")).sendKeys("Pranitha@25");
//		driver.findElement(By.xpath("(//div[@class='error__border w-full custom__border xls:mt-20 mt-10'])[2]")).sendKeys("Pranitha@25");
		Thread.sleep(4000);
		
//		driver.findElement(By.xpath("//span[text()='Show']")).click();
//		Thread.sleep(3000);
		
		WebElement signupbutton = driver.findElement(By.xpath("//button[text()='SIGN UP']"));
		signupbutton.click();
//		signupbutton.submit();
		
		System.out.println(driver.getTitle());

	}

}
