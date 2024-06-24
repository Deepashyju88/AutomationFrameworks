package LocatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathDemo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("sarang");
		
		//and
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("pande");
		
		//or
		driver.findElement(By.xpath("//input[@placeholder='E-Mail'  or @class='form-contrl']")).sendKeys("sarangravu@gmail.com");
		
		//index
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("9564681523");
		
		//position
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("Sarang@123");

		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("Sarang@123");

		List<WebElement> list= driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//input[@type='radio']"));
	
		for (WebElement i:list)
		{
			if(!i.isSelected())
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath(" //input[@value='Continue']")).submit();
		
		List<WebElement> list2=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		
		for (WebElement i: list2)
		{
			System.out.println(i.getText());
		}
	
	
	
	
	
	
	
	
	}

}
