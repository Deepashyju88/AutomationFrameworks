package LocatorDemo;

import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);

		driver.findElement(By.className("orangehrm-login-button")).click();
		Thread.sleep(2000);
	
//		List<WebElement> searchele= driver.findElements(By.tagName("input"));
//		System.out.println(searchele.size());
//	
//		int count = driver.findElements(By.tagName("img")).size();
//		System.out.println(count);
//			
//		driver.findElement(By.className("oxd-userdropdown-icon")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.linkText("Logout")).click();
//		Thread.sleep(2000);
//
//		List<WebElement> link = driver.findElements(By.tagName("a"));
//		for (WebElement i:link)
//		{
//			System.out.println(i.getText());
//			System.out.println(i.getAttribute("href"));
//			
//			if(i.getAttribute("href").contains("https://www.facebook.com/OrangeHRM/"))
//				
//			{
//				System.out.println("Link found ...........test passed");
//				i.click();
//				break;
//			}
//		}


	}

}
