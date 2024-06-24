package newScenario;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class AlertHandling {
  @Test
  public void alertTest() 
  {
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  driver.findElement(AppiumBy.id("hjdfjs")).click();
	  Alert alt = driver.switchTo().alert();
	  
	  alt.accept();
	  alt.dismiss();
  }
}
