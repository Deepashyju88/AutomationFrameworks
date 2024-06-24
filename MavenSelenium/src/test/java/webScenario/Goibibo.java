package webScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import helper.Utility;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-34 iHoHRr'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='sc-12foipm-38 dAUhfz']//input[@type='text']")).sendKeys("mum");

		List<WebElement> ele= driver.findElements(By.xpath("//li[@role='presentation']"));
		Utility.BootstrapDropDown(ele,"Aurangabad");

	    driver.findElement(By.xpath("//div[@class='sc-12foipm-38 dAUhfz']//input[@type='text']")).click();
	    driver.findElement(By.xpath("//div[@class='sc-12foipm-38 dAUhfz']//input[@type='text']")).sendKeys("bang");
	    List<WebElement> ele2= driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//span[@class='autoCompleteTitle ']"));
	    Utility.BootstrapDropDown(ele2, "Bangui, Central African Republic");	    
	}

}
