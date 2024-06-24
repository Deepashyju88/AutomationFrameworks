package WebHandlingSolution;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		String parantId = driver.getWindowHandle();
		System.out.println(parantId);
		
		Set<String> childIds = driver.getWindowHandles();
		System.out.println(childIds);
		
		for (String cessionId : childIds )
		{
			if (!parantId.equals(cessionId))
			{
				driver.switchTo().window(cessionId);
				driver.findElement(By.name("EmailHomePage")).sendKeys("Test@gmail.com");
				//driver.close();
			}
		}
		
		driver.switchTo().window(parantId);
		driver.findElement(By.name("username")).sendKeys("Admin");
	
	
	
	}

}
