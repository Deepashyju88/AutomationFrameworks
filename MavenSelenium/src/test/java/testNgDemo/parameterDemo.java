package testNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parameterDemo {
	
	@Parameters({"usm", "pwd"})
  @Test
  public void Login(String usm, String pwd) {
	  
	  WebDriver driver = new ChromeDriver();

	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.name("username")).sendKeys(usm);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
}
