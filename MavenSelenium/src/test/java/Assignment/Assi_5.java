// Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location

package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assi_5 {
  @Test
  public void getScreenshot() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com");
	  driver.findElement(By.id("APjFqb")).sendKeys("JavaScript");
	  
	  List<WebElement> ele= driver.findElements(By.xpath("//ul//li[@class='sbct PZPZlf']//div[@class='wM6W7d']//span"));
	  Thread.sleep(2000);
	  System.out.println("Total number of search result is :" +ele.size());
	  Ass_5_Utility.screenCapture(driver);

	  for (WebElement i : ele)
	  {
		  if(i.getText().contains("w3schools"))
		  {
			  i.click();
			  break;
		  }
	  }
	  String title = driver.getTitle();
	  System.out.println(title);
	  Ass_5_Utility.screenCapture(driver);
	  
	  Thread.sleep(2000);
	  driver.quit();
  }
}
