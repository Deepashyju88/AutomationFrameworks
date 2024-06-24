package LocatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrDemo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		
		if(actTitle.equals("Google"))
		{
			System.out.println("title match"+actTitle);
		}else
		{
			System.out.println("title not match");
		}
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElement(By.id("APjFqb")).sendKeys("TestNg");
		
		//List<WebElement> ele2 = driver.findElements(By.xpath(actTitle))
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul//li//div[@class='wM6W7d']"));
		
		System.out.println(ele.size());
		for(WebElement i:ele)
		{
			
			System.out.println(i.getText());
			if(i.getText().contains("dependency"))
			{
				i.click();
				break;
			}
		}
	}

}
