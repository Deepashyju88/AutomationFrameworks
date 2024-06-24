package Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Ass_2_BaseClass {
	
	public WebDriver driver;
	public Assin_2_LoginPage lp;
	
	@BeforeTest
	public void browserSetup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shop.lululemon.com/account/login?bvRedirectUrl=%2F");
		
		lp=new Assin_2_LoginPage(driver);
	}
	

}
