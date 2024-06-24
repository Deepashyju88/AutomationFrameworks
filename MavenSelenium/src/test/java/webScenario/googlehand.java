package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlehand {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  driver.get("https://www.google.com");
		  
		  driver.findElement(By.id("APjFqb")).sendKeys("JavaScript");
		  
		  List<WebElement> ele= driver.findElements(By.xpath("//ul//li[@class='sbct']//div[@class='wM6W7d']//span"));
		  System.out.println("element size : " +ele.size());
	  
	}

}
