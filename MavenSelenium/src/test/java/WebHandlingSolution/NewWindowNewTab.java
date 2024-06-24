package WebHandlingSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowNewTab {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		
		//new Tab
		WebDriver driver2=  driver1.switchTo().newWindow(WindowType.TAB);
		driver2.get("https://www.facebook.com");
		System.out.println("Title is : "+ driver2.getTitle());
		
		
		
		//new Window
		WebDriver driver3 = driver1.switchTo().newWindow(WindowType.WINDOW);
		driver3.get("https://www.amazon.in");
		System.out.println("title is "+driver3.getTitle());
		
	}

}
