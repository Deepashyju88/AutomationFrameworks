package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	public static void main(String[] args) {
		
		//to avoid any browser action. test will show only the conslo result
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
			
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		
		List<WebElement> list1= driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		
		System.out.println(list1.size());
		
		for (WebElement i : list1) {
			
			System.out.println(i.getText());
		}
		
	}

}
