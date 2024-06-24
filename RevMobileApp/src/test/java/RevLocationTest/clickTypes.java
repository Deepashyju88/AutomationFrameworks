package RevLocationTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import sessionAppium.RevInitialisesession;

public class clickTypes {
  @Test
  public void LongClick() {
	  
	  AppiumDriver driver = RevInitialisesession.initialiseAppiumDriver();
	  
	  driver.findElements(AppiumBy.id("hghjhk")).get(2).click();
	  
	  WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("jkdgfdjsfbgf"));
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele1).getId(),
			    "duration" ,1000
			));
	  
	  
	  //drag and drop
	  
	  WebElement ele2 = driver.findElement(AppiumBy.className("klshvkjdsh"));
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele2).getId(),
			    "endX", 688,
			    "endY", 933
			));
	  
	  String text = driver.findElement(AppiumBy.id("kjbdvjhfsdkj")).getText();
	  
	  System.out.println(text);
	  
	  
	  //Scroll
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			  "elementId", ((RemoteWebElement) ele1).getId(),
			    "direction", "down",
			    "percent", 0.75
			));
	  
	  WebElement ele5 = driver.findElement(AppiumBy.accessibilityId("hdgfdjdfsbf"));
	  
	  Alert alt = driver.switchTo().alert();
	  System.out.println(alt.getText());
	  alt.accept();
	  
	  //to check the status of the app
	  ((AndroidDriver)driver).queryAppState("io.appium.android.apis");

	  //to remove /uninstall the app
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  
	  
	  //to install the app
	  String path = "application path from resource file";
	  ((AndroidDriver)driver).installApp(path);
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  
	  
	  //run in backgroung
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(2000));
	  
	  
	  //keybord actions
	  
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.H));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.I));
	  
	  //notification
	  
	  ((AndroidDriver)driver).openNotifications();                                 

	  //airoplane mode off and on
	  ((AndroidDriver)driver).toggleAirplaneMode();
  
	  //device wifi
	  ((AndroidDriver)driver).toggleWifi();
  
	  //mobile data
	  ((AndroidDriver)driver).toggleData();
	  
	  //lock the device
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println(((AndroidDriver)driver).isDeviceLocked());
	  
	  ((AndroidDriver)driver).unlockDevice();
	  
	  //rotate
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
  
	  List<String> performaceTypes = ((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  
	  System.out.println(performaceTypes);
	  
	  
	  
	  
	  
	  
  
  }
}
