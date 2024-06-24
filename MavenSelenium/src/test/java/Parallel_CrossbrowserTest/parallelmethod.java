package Parallel_CrossbrowserTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parallelmethod {
	
	public WebDriver driver;
	
	@Test
	  public void setup() {
		driver= new ChromeDriver();
	  }

	
  @Test(priority=2)
  public void methida() {
		driver.get("https://www.facebook.com");
		System.out.println("test facebook");
  }
  
  @Test(priority=1)
  public void methidb() {
		driver.get("https://www.google.com");
		System.out.println("test google");
  }
  
  
  @Test(priority=3)
  public void methidc() {
		driver.get("https://www.amazon.com");
		System.out.println("test amazon");
  }
}
