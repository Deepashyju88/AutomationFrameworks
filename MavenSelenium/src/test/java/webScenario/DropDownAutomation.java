package webScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAutomation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println("the title is : " + driver.getTitle());
		
		//identify select based drop down
		//Select base
		WebElement ele = driver.findElement(By.name("url"));
		Select dd = new Select(ele);
		System.out.println("is multiple select option available? : "+dd.isMultiple());
		
		//single selector
		dd.selectByIndex(3);
		Thread.sleep(2000);
		
		dd.selectByVisibleText("Apps & Games");
		
		dd.selectByValue("search-alias=beauty");
		
		//print all the options from drop down
		List<WebElement> allopt= dd.getOptions();
		
		System.out.println("all the options size is "+ allopt.size());
		Thread.sleep(2000);

		for(WebElement i : allopt)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Appliances"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
