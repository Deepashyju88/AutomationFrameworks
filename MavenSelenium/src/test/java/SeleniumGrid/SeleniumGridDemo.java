package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
  @Test
  public void gridTest() throws MalformedURLException {
	  
	  ChromeOptions options = new ChromeOptions();
	  WebDriver driver = new RemoteWebDriver(new URL("https://ocalhost:4444"),options);
	  
	  driver.get("https://www.google.com");
	  
	  System.out.println("Application opened");
	  
	  System.out.println("The title is : "+ driver.getTitle());
	  driver.quit();
  }
}
