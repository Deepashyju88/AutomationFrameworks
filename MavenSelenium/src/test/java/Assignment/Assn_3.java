//3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.
package Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assn_3 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
	
		WebElement fromElement = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		fromElement.click();
		fromElement.sendKeys("chenn");	
		UtilFuctn.dropdownIRCTC(driver, "MGR CHENNAI CTL - MAS");
		System.out.println("Entered From location as MGR CHENNAI CTL - MAS");
		
		
		WebElement ToElement = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		ToElement.click();
		ToElement.sendKeys("mum");
		UtilFuctn.dropdownIRCTC(driver, "VASAI ROAD");
		screenShot.takeScreenShot(driver);
		System.out.println("Entered To location as VASAI ROAD");

		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		Thread.sleep(2000);
		screenShot.takeScreenShot(driver);
		System.out.println("Search result loaded sucessfully");
	}
}
