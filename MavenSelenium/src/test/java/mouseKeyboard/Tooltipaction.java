package mouseKeyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltipaction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.id("age"));
		
		Actions Act = new Actions(driver);
		Act.moveToElement(ele).perform();
		
		//to pause in debug is in source Ctrl + \
		String  tooltip = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		System.out.println(tooltip);
	}

}
