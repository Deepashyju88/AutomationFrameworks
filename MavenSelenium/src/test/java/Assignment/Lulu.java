package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lulu {
  @Test
  public void SearchAndCartDemo() throws InterruptedException 
  {
  
	
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.lululemon.com.au/en-au/home");
			
			driver.manage().window().fullscreen();
			
			driver.findElement(By.xpath("//a[@aria-label='STAY ON THE SITE']")).click();
			
			WebElement women = driver.findElement(By.xpath("//a[@aria-label='Women']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(women).perform();
			
			driver.findElement(By.xpath("(//a[@aria-label='Tops'])[1]")).click();
			
			Assert.assertTrue(driver.getCurrentUrl().contains("women/tops"),"Fail : fail to select the womens top catogory");
			System.out.println("Sucessfully landed in the women Tops page");
			
			driver.manage().window().fullscreen();

			driver.findElement(By.id("prod11380665")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("prod11380665")).click();
			
			Assert.assertTrue(driver.getCurrentUrl().contains("prod11380665"), "Fail : Fail to click on the product prod11380665");
			System.out.println("Sucessfully clicked on the product prod11380665");
			
			driver.manage().window().fullscreen();
			Thread.sleep(5000);
			
			driver.findElement(By.className("size-btns")).click();

			
			driver.findElement(By.xpath("(//button[@tabindex='0'])[2]")).click();
			
			System.out.println("Product added to the cart sucessfully");
  
  
  }
}
