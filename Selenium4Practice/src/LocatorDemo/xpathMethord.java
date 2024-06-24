package LocatorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathMethord {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		
		System.out.println("Find the title : " + driver.getTitle());
		
		WebElement list = driver.findElement(By.xpath("(//span[@class='a-carousel-page-count'])[1]"));
		
		System.out.println(list.getText());
		
		//the normalize-space method used to handle white space in a text
		
		//driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		//" org.openqa.selenium.ElementNotInteractableException
		
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@id, 'twotabs')]"));
		
		search.click();
		
		search.sendKeys("bags", Keys.ENTER);
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'twotabs')]")).clear();
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'twotabs')]")).sendKeys("Mobile", Keys.ENTER);
		
		
		
		
		
		
		
		
	}

}
