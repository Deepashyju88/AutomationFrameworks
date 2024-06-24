//2. Implement a Page Object Model for a login page using WebDriver.

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assin_2_LoginPage {
	
	private WebDriver driver;
	
	public Assin_2_LoginPage(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	//locator
	By userName = By.id("username");
	By pwd = By.name("password");
	By signin = By.xpath("(//button[@type='submit'])[1]");
	
	//method
	
	public String getloginUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String usn, String passwd) throws InterruptedException
	{
		driver.findElement(userName).sendKeys(usn);
		driver.findElement(pwd).sendKeys(passwd);
		Thread.sleep(3000);
		screenShot.takeScreenShot(driver);

		driver.findElement(signin).click();
	}

}
