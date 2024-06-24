package sessionAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstSession {
  @Test
  public void AndroidSession() throws MalformedURLException 
  {
	  //desired capabilities
	  
	  DesiredCapabilities cap = new DesiredCapabilities();
	  
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("appium:automationName", "uiautomator2");
	  cap.setCapability("appium:deviceName", "pixel_3a");
	  cap.setCapability("appium:udid", "emulator-5554");
	  
	  String AppPath = System.getProperty("C:\\Users\\shyju\\OneDrive\\Desktop\\QA\\javaWorkSpace\\RevMobileApp\\src\\test\\resources\\ApiDemos-debug.apk");
	  cap.setCapability("appium:app",AppPath);
	  URL url = new URL("http://0.0.0.0:4723");
	  
	  AppiumDriver driver = new AndroidDriver(url, cap);
	  
	  System.out.println("Session Id is  : "+driver.getSessionId());
	  
			  
  }
}
