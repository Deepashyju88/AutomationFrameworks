package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		WebElement ele = driver.findElement(By.id("APjFqb")); 
		
		System.out.println("Text"+ele.getText());
		
		System.out.println(ele.getAttribute("id"));
		
		System.out.println("Cssvalue"+ele.getCssValue("color"));
		
		System.out.println("Location: "+ ele.getLocation());
		System.out.println("size : "+ ele.getSize());
	}

}
