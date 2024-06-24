package DataDrivenTest;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class drop {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		
		System.out.println("The title is "+driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Fail title not match");
		System.out.println("Title matched");
		
		driver.manage().window().fullscreen();
		WebElement ele = driver.findElement(By.name("url"));
		
		ele.click();
		
		Select dd = new Select(ele);
		
		dd.selectByIndex(5);
		
		Thread.sleep(2000);
		
		dd.selectByValue("search-alias=baby");
		
		Thread.sleep(2000);
		
		dd.selectByVisibleText("Car & Motorbike");
		
		List<WebElement> allOpt = dd.getOptions();
		
		for(WebElement i : allOpt)
		{
			
			System.out.println(i.getText());
			
			if(i.getText().contains("Deals"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
