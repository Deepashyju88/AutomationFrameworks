package webScenario;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import helper.Utility;

public class RedBusDropDown {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pun");
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
		
		Utility.BootstrapDropDown(ele, "Nashik Phata");
		
		driver.findElement(By.id("dest")).sendKeys("Del");
		List<WebElement> dest = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//text[@class='placeHolderMainText']"));
		Utility.BootstrapDropDown(dest, "Majnu Ka Tilla");

	}

}
