package LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		
		System.out.println("test");
		
		driver.get("https://automationplayground.com/crm");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.id("email-id")).sendKeys("Test@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Test@123");
		
		driver.findElement(By.id("remember")).click();

		driver.findElement(By.id("submit-id")).click();
		
		System.out.println("************************************************************");
		WebElement sib = driver.findElement(By.id("submit-id"));
//		
System.out.println(sib.getAttribute("name"));
		
		driver.findElement(By.cssSelector("a.nav-link")).click();
		
		WebElement ele = driver.findElement(By.tagName("p"));
		
		System.out.println(ele.getText());
		
	}

}
