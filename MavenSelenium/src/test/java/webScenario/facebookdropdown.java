package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class facebookdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Amal");
		driver.findElement(By.name("lastname")).sendKeys("Neerav");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9564587546");
		driver.findElement(By.id("password_step_input")).sendKeys("AmalNeera456");
		
		WebElement dy = driver.findElement(By.id("day"));
		Utility.DropdownSelector(dy,"11");
		
//		Select dd1 = new Select(dy);
//		
//		System.out.println("is dropdown support multiple selection : "+dd1.isMultiple());
//		
//		List<WebElement> day= dd1.getOptions();
//		
//		System.out.println(day.size());
//		for(WebElement i : day)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("21"))
//			{
//				i.click();
//				break;
//			}
//		}
		
		WebElement mn= driver.findElement(By.name("birthday_month"));
		Utility.DropdownSelector(mn, "Nov");
		
		WebElement yy = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Utility.DropdownSelector(yy, "1984");
		
		
//		Select dd3 = new Select(yy);
//		dd3.selectByIndex(6);
//		
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
