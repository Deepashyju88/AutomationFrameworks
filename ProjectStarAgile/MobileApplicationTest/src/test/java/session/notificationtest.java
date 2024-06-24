package session;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class notificationtest {
  @Test
  public void notification() 
  {
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  ((AndroidDriver)driver).openNotifications();
	  String text = driver.findElements(AppiumBy.id("mnsbdfdb")).get(2).getText();
	  System.out.println("This is the text mesg : " + text);
  }
}
