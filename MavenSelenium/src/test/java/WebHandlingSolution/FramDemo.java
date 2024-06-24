package WebHandlingSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//handling frame using index
		//driver.switchTo().frame(0);
		
		//handling frame using ids/name
		//driver.switchTo().frame("mce_0_ifr");
		
		
		//handling frame using webelement
		WebElement frameId = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameId);
		
		
		WebElement ele = driver.findElement(By.id("tinymce"));
		ele.clear();
		ele.sendKeys("Hallo All");
		
	}

}
