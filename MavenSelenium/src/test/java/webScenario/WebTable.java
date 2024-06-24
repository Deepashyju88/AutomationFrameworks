package webScenario;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void Tableitration(List<WebElement> ele) {
		
		System.out.println("total element size : "+ele.size());
		
		for(WebElement i : ele)
		{
			System.out.println(i.getText());
		}
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=test123&submit-name=");
	
		System.out.println("********All heading***************");
		
		List<WebElement> hd = driver.findElements(By.xpath("//thead//tr//th"));
		Tableitration(hd);
		
		System.out.println("********Total rows***************");
		int rows = driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println(rows);
		
		System.out.println("********Total cells in a row***************");
		int cells = driver.findElements(By.xpath("( //tbody//tr)[1]//td")).size();
		System.out.println(cells);
		
		System.out.println("********Print row 4***************");
		String row4 = driver.findElement(By.xpath("( //tbody//tr)[4]")).getText();
		System.out.println(row4);
		
		System.out.println("********2nd collumn***************");
		List<WebElement> ele = driver.findElements(By.xpath(" //tbody//tr//td[2]"));
		Tableitration(ele);

		System.out.println("********complete table data***************");
		List<WebElement> ele2 = driver.findElements(By.xpath("//tbody//tr//td"));
		Tableitration(ele2);


//		System.out.println("total element size : "+hd.size());
//	
//		for(WebElement i : hd)
//		{
//			System.out.println(i.getText());
//		}
//	
	
	
	}

}
