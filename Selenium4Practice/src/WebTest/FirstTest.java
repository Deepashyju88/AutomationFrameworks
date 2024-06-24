package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {

		// Creating Driver sessions
		System.out.println("Launching Chrome driver");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Launching Firefox driver");
		WebDriver driver1 = new FirefoxDriver();
		
		System.out.println("Launching EdgeBrowser");
		WebDriver driver2 = new EdgeDriver();
		
	}

}
