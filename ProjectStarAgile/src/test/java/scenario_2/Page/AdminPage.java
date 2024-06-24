package scenario_2.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class AdminPage {
	
	private WebDriver driver;
	
	public AdminPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	private By list = By.xpath("//ul//li//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");
	private By usrnm = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By role = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
	private By dropdown = By.xpath("//div[@class='oxd-select-option']");
	private By status = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
	private By search = By.xpath("//button[@type='submit']");
	private By srchL = By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-card']//div[@role='row']");

	
	public List<WebElement> getOption()
	{
		return driver.findElements(list);

	}
	
	public int searchByUserName(String un) throws InterruptedException
	{
		
		driver.findElement(usrnm).sendKeys(un);
		driver.findElement(search).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(srchL);
		
		return list.size();
		
	}
	
	public int searchByUserRole(String value) throws InterruptedException
	{
		driver.navigate().refresh();

		driver.findElement(role).click();
		List<WebElement> ele = driver.findElements(dropdown);
		for (WebElement i : ele)
		{
			if (i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
		driver.findElement(search).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(srchL);
		return list.size();
	}
	
	public int searchByUserStatus(String value) throws InterruptedException
	{
		driver.navigate().refresh();

		driver.findElement(status).click();
		List<WebElement> ele1 = driver.findElements(dropdown);
		for (WebElement i : ele1)
		{
			if (i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(search).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(srchL);
		return list.size();
	}
}
