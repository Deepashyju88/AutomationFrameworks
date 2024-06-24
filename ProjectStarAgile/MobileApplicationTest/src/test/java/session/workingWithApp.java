package session;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class workingWithApp {
  @Test
  public void appTest() {
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  //check current status

	  ((AndroidDriver)driver).queryAppState("io.appium.android.apis");
	  
	  //to un install the app
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  
	  // install the app
	  
	  //path
	  	String appPath = System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";

	  	((AndroidDriver)driver).installApp(appPath);

	  	
	  	//terminate or close the app
	  	((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  	
	  	//run background app
	  	((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));

  }
}
