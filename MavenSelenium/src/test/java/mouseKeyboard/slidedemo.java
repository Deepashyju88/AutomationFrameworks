package mouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slidedemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement sld = driver.findElement(By.className("ui-slider-handle"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(sld).moveToElement(sld, 200, 0).build().perform();
	}

}
