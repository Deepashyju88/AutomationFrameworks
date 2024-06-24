package WebHandlingSolution;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("Sunina Iqbal");
		
		Utility.getScreenshot(driver);
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alt= driver.switchTo().alert();		
		
		alt.accept();

		driver.findElement(By.id("password")).sendKeys("sun123");
		Utility.getScreenshot(driver);
		driver.findElement(By.name("proceed")).click();
		
	}

}
