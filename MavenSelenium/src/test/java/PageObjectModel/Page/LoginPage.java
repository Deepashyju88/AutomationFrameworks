package PageObjectModel.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Encapsulation data + function
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)//from BaseClass
	{
		this.driver = driver;
	}
	
	//locator
	private By un= By.name("username");
	private By pwd = By.name("password");
	private By sut = By.xpath("//button[@type='submit']");
	
	//method
	public void doLogin(String username, String password)
	{
		driver.findElement(un).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(sut).click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	

}
