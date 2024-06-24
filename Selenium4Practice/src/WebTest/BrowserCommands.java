package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//open google application in browser
		
		driver.get("https://www.google.com");
	
		//current page title - get title() returns string
		String actTitle = driver.getTitle();
		System.out.println("the title is : "+ actTitle);
		
		if(actTitle.equals("Google"))
		{
			System.out.println("Test pass........result match");
		}else
		{
			System.out.println("Test fail.......result not match");
		}
		
		
		//driver.close();
		driver.quit();
		}

}
