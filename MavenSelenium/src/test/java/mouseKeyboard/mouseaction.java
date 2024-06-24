package mouseKeyboard;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		WebElement Rele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(Rele).perform();
		
		List<WebElement> els= driver.findElements(By.xpath("(//ul)[3]//li//span"));
		
		for (WebElement i : els)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Copy"))
			{
				i.click();
				break;
			}
			
		}
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
