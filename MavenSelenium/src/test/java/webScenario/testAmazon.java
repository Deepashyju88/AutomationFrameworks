package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAmazon {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:///www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("APjFqb")).sendKeys("JAVA");
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		
		for (WebElement i : ele)
		{
			if(i.getText().contains("script online compiler"))
			{
				i.click();
				break;
			}
		}
	}

}
