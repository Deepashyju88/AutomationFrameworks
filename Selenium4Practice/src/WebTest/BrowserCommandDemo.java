package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//to open application url - get(url) 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		//To capture title - getTitle()
		String title = driver.getTitle();
		System.out.println("the title is : "+title);

		//To get the current url of the application
		String curl= driver.getCurrentUrl();
		System.out.println("current url is : "+curl);
		
		//to get page source -getPageSource()
	    String pages= driver.getPageSource();
		System.out.println("page source is : "+ pages);
		
		//To close the browser close() or quit()
		// close() is to close one current window active
		//quit is to close all the open windows by selenium it will close
		
		//driver.close();
		driver.quit();		
		
		
		
	}

}
