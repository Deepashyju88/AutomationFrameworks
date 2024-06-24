package session;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
 


public class CreateFirstAppiumSession {
  @Test
  public void sessiontest() throws MalformedURLException, InterruptedException {
	  
	  	DesiredCapabilities cap = new DesiredCapabilities();
	  	
	  	cap.setCapability("platformName","Android");
	  	cap.setCapability("appium:automationName","uiautomator2");
	  	cap.setCapability("appium:deviceName", "pixel_3a");
	  	cap.setCapability("appium:udid", "emulator-5554");
	  	
	  	
	  	//application
	  	
	  	String appPath = System.getProperty("user.dir")+"\\src\\est\\resources\\ApiDemos-debug.apk";
	  	
	  	cap.setCapability("appium:app",appPath);
	  	Thread.sleep(5000);

	  	//server connectivity
	  	URL url = new URL("http://0.0.0.0:4723");
	  	
	  	//AppiumDriver driver = new AndroidDriver();
	  	Thread.sleep(5000);
	  	//to create a session
	  	AppiumDriver driver = new AndroidDriver(url,cap);
	  	Thread.sleep(5000);

	  	System.out.println("Session id is : "+driver.getSessionId());
	  	
	  	
	  	
  
  }
}
