package LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("java");
		

			
	}

}
