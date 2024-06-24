package WebHandlingSolution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jsExecutor {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("alert('Hi all this is new js')");
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Java", Keys.ENTER);
		
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,6000)");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
//		Actions act = new Actions(driver);
//		
//		act.contextClick(ele).perform();
		//driver.close();
		
//		
		Actions act = new Actions(driver);
//		act.doubleClick(ele).perform();
//		
//		
//		act.moveToElement(ele).perform();
//		act.dragAndDrop(ele1,ele2).perform();
		
		//act.clickAndHold(ele1).moveToElement(ele2).release().build.perform();
		
		
	//	act.clickAndHold(ele).moveToElement(ele2, 200, 0).build().perform();
		
//		Robot rb = new Robot();
//		rb.delay(2000);
//		
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyRelease(KeyEvent.VK_TAB);
		
		
		
	}

}
