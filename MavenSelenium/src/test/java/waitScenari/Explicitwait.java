package waitScenari;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicitwait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		String value = driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
		System.out.println(value);
	}

}
