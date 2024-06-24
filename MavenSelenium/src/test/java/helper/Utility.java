package helper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	
	//screenshot
	public static void getScreenshot(WebDriver driver)
	{

		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File temp = ts.getScreenshotAs(OutputType.FILE);
		  
		  //location
		  File dest = new File("./"+"Screenshots\\ProjectName"+System.currentTimeMillis()+".png");
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Wait() Explicit wait
	
	public static WebElement WaitForPresenceofElement(WebDriver driver, By locator)
	{
		WebDriverWait obj = new WebDriverWait(driver, Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement ButObjWait(WebDriver driver, By loc)
	{
		WebDriverWait butObj = new WebDriverWait(driver, Duration.ofSeconds(5));
		return butObj.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	public static WebElement WaitforVisibility(WebDriver driver, By loc)
	{
		WebDriverWait visibilityobj = new WebDriverWait(driver, Duration.ofSeconds(5));
		return visibilityobj.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static WebElement WaitforVisibility(WebDriver driver, By loc)
	{
		WebDriverWait visibilityobj = new WebDriverWait(driver, Duration.ofSeconds(5));
		return visibilityobj.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static Boolean WaitforUrlContain(WebDriver driver, String url)
	{
		WebDriverWait urlObj = new WebDriverWait(driver,Duration.ofSeconds(5));
		return urlObj.until(ExpectedConditions.urlContains(url));
	}
	
	public static Boolean WaitforTitleContain(WebDriver driver, String title)
	{
		WebDriverWait titleObj = new WebDriverWait(driver,Duration.ofSeconds(5));
		return titleObj.until(ExpectedConditions.titleContains(title));
	}
	
	
	
	
	
	
	
	
	
	public static void DropdownSelector(WebElement ele, String value) {
		
		Select dd = new Select(ele);
		
		System.out.println("is dropdown support multiple selection : "+dd.isMultiple());
		
		List<WebElement> allOptsion= dd.getOptions();
		
		System.out.println(allOptsion.size());
		for(WebElement i : allOptsion)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	//to automate bootstrap drop down
	
	public static void BootstrapDropDown(List<WebElement> ddEle, String value)	
	{
		System.out.println("The total number of results on search"+ddEle.size());
		for (WebElement i : ddEle)
			{
				System.out.println(i.getText());
				if(i.getText().contains(value))
				{
					i.click();
					break;
				}
			}
	}

}
