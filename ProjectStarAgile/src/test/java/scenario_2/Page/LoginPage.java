package scenario_2.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By UserName= By.name("username");
	private By Pwd = By.name("password");
	private By LgBtn = By.xpath("//button[@type='submit']");
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}

	public void doLogin(String un, String pswd)
	{
		driver.findElement(UserName).sendKeys(un);
		driver.findElement(Pwd).sendKeys(pswd);
		driver.findElement(LgBtn).click();
	}
}
