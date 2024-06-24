package session;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrolInJava {
  @Test
  public void ScrollTest() throws InterruptedException 
  {
	  
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  //complete page list
	  WebElement ele = driver.findElement(AppiumBy.accessibilityId("scrole"));
	  
	// Java
	  ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			  "elementId", ((RemoteWebElement) ele).getId(),
	      "direction", "down",
	      "percent", 0.75
	  ));
	  
	  
	  Thread.sleep(2000);
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			  "elementId", ((RemoteWebElement) ele).getId(),
	      "direction", "up",
	      "percent", 0.75
	  ));
  }
  
  @Test
  public void swipeTest()
  {
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  //complete page list
	  WebElement ele = driver.findElement(AppiumBy.accessibilityId("scrole"));
	// Java
	  ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			  "elementId", ((RemoteWebElement) ele).getId(),
	      "direction", "left",
	      "percent", 0.75
	  ));
  }
}
