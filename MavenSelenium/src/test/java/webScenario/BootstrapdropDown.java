package webScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapdropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@aria-labelledby='menu1']//li//a"));
		System.out.println(ele.size());
		for (WebElement i : ele)
		{
			System.out.println(i.getText());
		}
	
	
	
	}

}
