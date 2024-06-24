package waitScenari;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {
	
	


	public static void main(String[] args) {
			
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			
		By email = By.id("input-email");
		By passwd = By.name("password");
		By butn = By.xpath("//input[@value='Login']");
		
		Boolean urlStatus = WaitforUrlContain(driver, "login");
		if (urlStatus)
		{
			
			System.out.println("url : " +driver.getCurrentUrl());
			
			boolean titleStatus = WaitforTitleContain(driver,"Account");
			System.out.println("status of title is : "+ titleStatus);
				
			System.out.println("TITLE : "+ driver.getTitle());
		
		//WebDriver Wait class
		
//		WebDriverWait obj = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement ele = obj.until(ExpectedConditions.presenceOfElementLocated(email));
		//ele.sendKeys("test@gmail.com");
		
		WebElement ele1 = WaitForPresenceofElement(driver, email);
		ele1.sendKeys("Deep@gmail.com");
		
//		
//		WebDriverWait butObj = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement butEle = butObj.until(ExpectedConditions.elementToBeClickable(butn));
		//butEle.click();
		
		
		
		WebElement ele3 = WaitforVisibility(driver,passwd);
		ele3.sendKeys("deep123");
		
		WebElement ele2 = ButObjWait(driver,butn);
		ele2.click();
		
		}
		
	}

}
