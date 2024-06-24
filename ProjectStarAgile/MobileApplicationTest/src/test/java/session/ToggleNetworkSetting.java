package session;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ToggleNetworkSetting {
  @Test
  public void toggleTest() 
  {
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  //airplane mode
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  //wifi
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  //mobiledata
	  ((AndroidDriver)driver).toggleData();
  
	  
  }
}
