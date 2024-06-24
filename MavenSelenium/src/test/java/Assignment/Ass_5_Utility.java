// Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location
package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass_5_Utility {
	
	public static void screenCapture(WebDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		  File temFile = ts.getScreenshotAs(OutputType.FILE);
		  File destinationFile = new File("./"+"\\Assin_screenshot//GoogleSearch"+System.currentTimeMillis()+".png");
		  try {
			FileHandler.copy(temFile, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
