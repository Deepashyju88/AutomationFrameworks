package Parallel_CrossbrowserTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	public WebDriver driver;
	
	@Parameters({"bName"})
  @Test
  public void browserTest(String bName) 
  {
	  
	  if (bName.equalsIgnoreCase("chrome"))
	  {
		  driver= new ChromeDriver();
	  }else if(bName.equalsIgnoreCase("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }else if(bName.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
	  }
	  
	  driver.get("https://www.amazon.in");
	  
  }
}
