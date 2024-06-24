package Parallel_CrossbrowserTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelWithMethod {
	@Test(priority=3)
	  public void TestChrome() {
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.in");
		  System.out.println("Title is : "+ driver.getTitle());  
	  }
	  
	  @Test(priority=2)
	  public void TestFirfox() {
		  WebDriver driver = new FirefoxDriver();
		  driver.get("http://www.facebook.com");
		  System.out.println("Title is : "+ driver.getTitle());  
	  }
	  
	  @Test(priority=1)
	  public void TestEdge() {
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.amazon.com/");
		  System.out.println("Title is : "+ driver.getTitle());  
	  }
}
