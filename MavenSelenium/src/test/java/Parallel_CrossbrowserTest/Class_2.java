package Parallel_CrossbrowserTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class_2 {
	@Test
	  public void TestFirfox() {
		  WebDriver driver = new FirefoxDriver();
		  driver.get("http://www.facebook.com");
		  System.out.println("Title is : "+ driver.getTitle());  
	  }
}
