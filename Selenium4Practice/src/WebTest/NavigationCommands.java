package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println("Title : "+driver.getTitle());
		
		
		//Navigate from Google to facebook
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Title : "+driver.getTitle());
		
		Thread.sleep(2000);
		//to back
		driver.navigate().back();
		
		//forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		
		
		
		
		}

		
}
