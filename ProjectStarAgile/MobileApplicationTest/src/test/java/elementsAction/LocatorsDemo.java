package elementsAction;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class LocatorsDemo {
  @Test
  public void androidLocator() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  AppiumDriver driver = CreateSession.initializeDriver();
	  Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("Session id from locatore class is : "+ driver.getSessionId());
	  WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("ele1 text is : "+ ele1.getText());
	  ele1.click();
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  
	  driver.navigate().back();
	  
	  
	  
  }
}
