package LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo_Class {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		
		// use class, may cause issue due to multiple class name for multiple elements
		//in that case use cssSelector by using tag name, multiple class name 
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
