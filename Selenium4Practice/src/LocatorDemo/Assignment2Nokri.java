package LocatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Nokri {

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links : "+allLink.size());
		
		String expect = "https://www.naukri.com/fresher-jobs?src=gnbjobs_homepage_srch";
		
		for(WebElement i:allLink)
		{
			try {
			if(i.getAttribute("href").contains(expect))
			{
				System.out.println("The expected Link found  : "+i.getAttribute("href"));

			}
			}catch(NullPointerException e)
			{
				System.out.println("null value not allowed");
			}
		}

			
	}
}

