package DataDrivenTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HrmDatadriven {
	
 //@Test(dataProvider="testdata1",dataProviderClass=CustomData.class)
  @Test(dataProvider="ExcellData",dataProviderClass=CustomData.class)
  public void LoginTest(String un, String pwd) 
  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys(un);

		Reporter.log("Log : The key word entered ", true);
		driver.findElement(By.name("password")).sendKeys(pwd);

		Reporter.log("Log : Password entered " , true);
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Fail : The login failed");
		System.out.println("Login sucessfull!");
	
		
	
  }
}
