package Parallel_CrossbrowserTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class_1 {
	@Test
	  public void TestChrome() {
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.in");
		  System.out.println("Title is : "+ driver.getTitle());  
	  }
	  
	  
}
