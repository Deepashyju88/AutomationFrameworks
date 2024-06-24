package Scenario_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_out {
	
	  public WebDriver driver;

  @Test(priority=1,dataProvider="ExcellData",dataProviderClass=CustomData.class)
	//  @Test(priority=1)
  public void Login(String un, String pwd) throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  System.out.println("The user name : "+un+ " Password is : "+pwd);
	  Utility.screenCapture(driver);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Fail : Login failed");
	  System.out.println("Login sucessfully......");
	  
	  this.Logout();
  }
  
  @Test(priority=2, dependsOnMethods="Login")
  public void Logout() {
	  driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	  Utility.screenCapture(driver);
	  driver.findElement(By.xpath("(//a[@role='menuitem'])[4]")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Fail : Logout failed to excecute");
	  System.out.println("Logout sucessfully........");  
	  
  }
}
