package RealTimeAnnotationUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMTestCase extends BaseClass
{
	
	
	
  @Test(priority=1)
  public void signinLinkValidation() 
  {
	  driver.findElement(By.linkText("Sign In")).click();
	  
  }
  
  @Test(priority=2)
  public void loginValidation() 
  {
	  driver.findElement(By.id("email-id")).sendKeys("testuser@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();  
	  
	  //validation
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"login failed");
	  System.out.println("Login sucessfully");
  }
  
  
}
