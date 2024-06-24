package mouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		
		
		driver.switchTo().frame("iframeResult");
		WebElement smly = driver.findElement(By.xpath("//img[@alt='Smiley']"));
		Actions act = new Actions(driver);
		act.moveToElement(smly).perform();
		System.out.println("image of smily on big size");
		
	
	
	
	
	}

}
