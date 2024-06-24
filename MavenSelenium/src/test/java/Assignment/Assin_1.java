//1. Write a WebDriver script to navigate to a website and click on a specific link.

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assin_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/tripideas/tourist-attractions");
		Assert.assertTrue(driver.getCurrentUrl().contains("tripideas"), "Fail : Fail to open the Makemytrip site");
		screenShot.takeScreenShot(driver);
		System.out.println("makemytrip site opened sucessfully");
		
		driver.findElement(By.linkText("Hotels")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("hotels"),"Fail : Fail to open the hotel link");
		screenShot.takeScreenShot(driver);
		System.out.println("The Hotel link opened sucessfully");
		
		driver.quit();
	}

}
