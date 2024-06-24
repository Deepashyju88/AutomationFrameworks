package WebHandlingSolution;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTypeDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		//switch to alert tab
		Alert alt1 = driver.switchTo().alert();
		System.out.println("Alert Text : " + alt1.getText());
		
		//click the alert ok butn
		alt1.accept();
		WebElement  mesg = driver.findElement(By.id("result"));
		System.out.println("the result mesg is : "+ mesg.getText());
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alt2= driver.switchTo().alert();
		System.out.println("The alt2 mesg is : " + alt2.getText());
		alt2.dismiss();
		WebElement mesg2 = driver.findElement(By.id("result"));
		System.out.println("The result mesg is for cancell is : " +mesg2.getText());
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt3 = driver.switchTo().alert();
		alt3.sendKeys("Test mesg passed");
		alt3.accept();
		WebElement mesg3 = driver.findElement(By.id("result"));
		System.out.println("The result mesg is for prompt is : " +mesg3.getText());
		
		
		
		
		
		
	}

}
