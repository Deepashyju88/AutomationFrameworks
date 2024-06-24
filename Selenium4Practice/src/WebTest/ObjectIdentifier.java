package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ObjectIdentifier {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
//		//By locator technique
//		//By is a class in selenium
//		//By class will help u to find/get the locator
//		//By.locator always returns By class Object only
//	
//		By searchEle = By.id("APjFqb");
//		
//		WebElement searchBox= driver.findElement(searchEle);
//	
//		//Action on webelement
//		searchBox.sendKeys("java",Keys.ENTER);
//		
		
		
		
//		
//		
//		System.out.println("**************************************");
//	
//		//identify and validate + action
//		
//		WebElement ele = driver.findElement(By.id("APjFqb"));
//		
//		System.out.println("Is displayed : "+ele.isDisplayed());
//		
//		System.out.println("is searchbox enebled : "+ele.isEnabled());
//		
//		ele.sendKeys("Selenium",Keys.ENTER);
		
		
	
	
	System.out.println("****************************************");
			//short methord to find and action 
	
		driver.findElement(By.id("APjFqb")).sendKeys("TestNg",Keys.ENTER);
	
	
		
	
	
	
	
	}

}
