package testNgDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleValidation {
  @Test
  public void TitleValidation()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  String actTitle = driver.getTitle();
	  
	  Assert.assertEquals(actTitle,"Google", "Fail : the title not match");
	  System.out.println("Pass : the title matches");
	  

  }
}
