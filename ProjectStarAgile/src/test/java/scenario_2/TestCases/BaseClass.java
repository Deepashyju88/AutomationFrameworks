package scenario_2.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import scenario_2.Page.AdminPage;
import scenario_2.Page.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public AdminPage ap;
	
	@BeforeTest
	public void BrowserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp = new LoginPage(driver);
		ap = new AdminPage(driver);
	}
	
	@BeforeClass
	public void setUp()
	{
		lp.doLogin("Admin", "admin123");
	}


	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
