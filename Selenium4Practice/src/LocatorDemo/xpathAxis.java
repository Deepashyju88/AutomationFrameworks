package LocatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxis {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=test123&submit-name=");
	
		//get the ancestor of john
		System.out.println("***********************john ancestor****************");
		WebElement ele1= driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody"));
		System.out.println(ele1.getText());
		
		//get the parant of john
		System.out.println("***********************john parent****************");
		WebElement ele2 = driver.findElement(By.xpath("//td[text()='John']//parent::tr"));
		System.out.println(ele2.getText());
	
		//get the child
		System.out.println("***********************john child****************");
		List<WebElement> ele3 = driver.findElements(By.xpath("(//tbody//tr)[4]//child::td"));
		System.out.println("total child : "+ele3.size());
		
		for (WebElement i : ele3)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("***********************get previous elements of john siblings****************");
		List<WebElement> ele4 = driver.findElements(By.xpath("//td[text()='John']//preceding::tr"));
		for(WebElement i : ele4)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("***********************get previous elements of john siblings****************");

		WebElement ele5 = driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td"));
		System.out.println(ele5.getText());
		
		System.out.println("***********************get following elements of john siblings****************");

		List<WebElement> ele6 = driver.findElements(By.xpath("//td[text()='John']//following::td"));
		for (WebElement i: ele6)
		{
			System.out.println(i.getText());
		}
	
		System.out.println("***********************get following elements of john siblings****************");

		List<WebElement> ele7 = driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
	
		for (WebElement i : ele7)
		{
			System.out.println(i.getText());
		}
		System.out.println("***********************get following single elements of john siblings****************");

		WebElement ele8 = driver.findElement(By.xpath("//td[text()='John']//following-sibling::td[1]"));
		System.out.println(ele8.getText());
	}

}
