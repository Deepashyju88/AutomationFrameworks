//3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.
package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilFuctn {
	
	public static void dropdownIRCTC(WebDriver driver,String value)
	{
		List<WebElement> list = driver.findElements(By.xpath("//ul//li//span[@class='ng-star-inserted']"));
		
		for(WebElement i:list)
		{
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}

}
