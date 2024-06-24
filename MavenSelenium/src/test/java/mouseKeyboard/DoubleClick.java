package mouseKeyboard;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		WebElement DubBut = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.doubleClick(DubBut).perform();
		
		Alert alt = driver.switchTo().alert();
		System.out.println("Text mesg is : "+alt.getText());
		alt.accept();
	}

}
