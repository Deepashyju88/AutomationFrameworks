package RevLocationTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import sessionAppium.RevInitialisesession;

public class locatorDemo {
  @Test
  public void sessionStart() {
	  
	 AppiumDriver driver =  RevInitialisesession.initialiseAppiumDriver();
	 
	 System.out.println("The Locatorpage session id is : "+driver.getSessionId());
	 
	 WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	 
	 ele1.click();
	 System.out.println(ele1.getText());
	 
	 
	 WebElement ele2 = driver.findElements(AppiumBy.accessibilityId("jsdkfhkjh")).get(2);
	 ele2.click();
	 
	 //go back to perivious page
	 
	 driver.navigate().back();
	 
  }
}
