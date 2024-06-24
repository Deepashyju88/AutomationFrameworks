package Scenario_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void screenCapture(WebDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		  File temFile = ts.getScreenshotAs(OutputType.FILE);
		  File destinationFile = new File("./"+"\\screenshot//OrangeHrm"+System.currentTimeMillis()+".png");
		  try {
			FileHandler.copy(temFile, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
