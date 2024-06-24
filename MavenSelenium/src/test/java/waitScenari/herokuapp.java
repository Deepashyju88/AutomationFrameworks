package waitScenari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

import org.openqa.selenium.WebElement;

public class herokuapp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		By button = By.xpath("//button[text()='Start']");
		By tex = By.xpath("//div[@id='finish']");
		
		Utility.ButObjWait(driver, button).click();
		WebElement tx = Utility.WaitforVisibility(driver, tex);
		System.out.println(tx.getText());
	
	
	}

}
