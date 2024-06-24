package mouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement dragable = driver.findElement(By.id("draggable"));
		
		WebElement dropable = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		//act.clickAndHold(dragable).moveToElement(dropable).release().perform();
		
		act.dragAndDrop(dragable, dropable).perform();
		
		System.out.println("the code is working");
		}

}
