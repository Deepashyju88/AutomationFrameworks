package session;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickAction {
  @Test
  public void LongClickTest()
  {
	  AppiumDriver driver= CreateSession.initializeDriver();
	  
	  driver.findElement(AppiumBy.accessibilityId("view")).click();
	  
	  //driver.findElement(AppiumBy.accessibilityId("drag and drop")).click();
	  WebElement ele2 = driver.findElement(AppiumBy.accessibilityId("drag and drop"));
	  
	  driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele2).getId()
			));
	  System.out.println("click using mobile gestures");
	  
	  WebElement ele1= driver.findElement(AppiumBy.id("jksdgkdjgsn"));
	  
	  
	// Java
	  ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
	      "elementId", ((RemoteWebElement) ele1).getId(), "duration",1000
	  ));
	  
	  System.out.println("long click on first drop");
	  
	  
	  
	// Java
	  ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	      "elementId", ((RemoteWebElement) ele2).getId(),
	      "endX", 388,
	      "endY", 985
	  ));
  }
}
