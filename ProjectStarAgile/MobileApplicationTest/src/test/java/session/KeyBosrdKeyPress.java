package session;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.AndroidDriver;


public class KeyBosrdKeyPress {
  @Test
  public void TextTypeTest() 
  {
	  
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  WebElement TextArea = driver.findElement(AppiumBy.accessibilityId("jjn,kmsdgfd"));
	  
	  TextArea.click();
	  TextArea.sendKeys("Hallo Every one");
	  
	  //keyboard action
	  
	  
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
  
  
  
  }
}
