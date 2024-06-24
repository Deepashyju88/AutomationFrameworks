package RevisionGroup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calander {
	
	public static void main(String[] arg) throws InterruptedException
	{
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		

		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String exMonth = "Jun";
		String exYear = "2025";
		String exDate = "1";
		
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		
		while(true){
		String ele1 = driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
		String cmonth = ele1.split(" ")[0];
		String cyear = ele1.split(" ")[1];
		
		System.out.println(cmonth+ cyear);
		
		if(cmonth.contains(exMonth) && cyear.contains(exYear))
		{
			break;
		}else
		{
			driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
		}
		}

		List<WebElement> allDates = driver.findElements(By.xpath("//div//span[contains(@class,'DayTilesWrapper')]//span[contains(@class,'DayTiles__CalendarDaysSpan')]"));
		
		
		for(WebElement i: allDates)
		{
			//if(i.getText().equals(exDate))
			if(i.getText().contains(exDate))
			{
				i.click();
				break;
			}
		}
		
		
		
	}

}
