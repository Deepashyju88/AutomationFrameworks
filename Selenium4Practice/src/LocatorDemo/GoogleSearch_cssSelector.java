package LocatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch_cssSelector {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("selenium");
		
		List<WebElement> list1 = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));

		System.out.println("the size is : "+list1.size());
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
	}

}
