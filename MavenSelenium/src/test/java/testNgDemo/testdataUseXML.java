package testNgDemo;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testdataUseXML {
	
	@Parameters({"un","pwd"})
	@Test
  public void loginTest(String un, String pwd) 
  {
	  WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys(un);

		driver.findElement(By.name("password")).sendKeys(pwd);

		driver.findElement(By.className("orangehrm-login-button")).click();
		
		String curl = driver.getCurrentUrl();
		Assert.assertTrue(curl.contains("dashboard"),"Fail : login failed");
		System.out.println("Login sucessfully");
  }
}
