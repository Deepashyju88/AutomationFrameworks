package LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorDemo1 {

	public static void main(String[] args) {
		//searchcontext is the parant class of webdriver. but include only 2 classes
		//findelement() and Findelemnets()
		//SearchContext s= new ChromeDriver();
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		
		
		
	}

}
 