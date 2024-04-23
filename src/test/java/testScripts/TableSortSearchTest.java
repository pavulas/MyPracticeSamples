package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSortSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		
		//To fetch the details of an employee
//		WebElement x = driver.findElement(By.xpath("//td[text()='A. Satou']//following-sibling::td"));
		
		List <WebElement> x = driver.findElements(By.xpath("//td[text()='A. Satou']//following-sibling::td"));
		System.out.println(x.size());
		for (WebElement i : x) {
			
			System.out.println(i.getText());
			}
		//To fetch the salary of an employee
		WebElement salary = driver.findElement(By.xpath("//td[text()='A. Satou']//following-sibling::td[5]"));
		System.out.println("Salary of the employee:"  + salary.getText());

		//To fetch the employees who are in New York
		List <WebElement> newyrk = driver.findElements(By.xpath("//td[text()='New York']//preceding-sibling::td[2]"));
        for (WebElement cell : newyrk) {
			
			System.out.println("People in New York are:" +cell.getText());
			}
	}

}
