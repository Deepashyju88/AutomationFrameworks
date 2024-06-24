package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
	
		String month = "Apr";
		String year = "2025";
		String date = "25";
		
		while(true)
		{
		String ele = driver.findElement(By.xpath("//div[contains(@class,'DayNavigator')][2]")).getText();
		String cmonth = ele.split(" ")[0];
		String cyear = ele.split(" ")[1];
		System.out.println(cmonth+" " +cyear);
	
		if(cmonth.contains(month))
		{
			break;
		}else
		{
			driver.findElement(By.xpath("//div[contains(@class,'DayNavigator')][3]")).click();
		}
		
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//div//span[contains(@class,'CalendarDaysSpan')]"));
		
		for(WebElement i : list)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
	}

}
