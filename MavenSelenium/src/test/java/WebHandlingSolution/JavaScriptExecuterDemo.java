package WebHandlingSolution;

import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo {
	
	public static void Scrolldown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}
	
	public static void ScrollUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

	public static void ScrollTillElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView",ele);
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//javascriptExictor is an interface in selenium to handle javascript  	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('This is from JAVA ')");
		
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert text is : "+alt.getText());
		alt.accept();
		
		//to get js title
		System.out.println("java title : " +driver.getTitle());
		//String title = js.executeScript(return d)
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		WebElement ele= driver.findElement(By.xpath("(//h2[@class='a-color-base headline truncate-2line'])[2]"));
		js.executeScript("arguments[0].scrollIntoView",ele);
		
		System.out.println("scrolled");
//		Scrolldown(driver);
//		System.out.println("window scroll done!");
//		
//		
//		Thread.sleep(2000);
//		ScrollUp(driver);
//		
//		
//		//js.executeScript("window.scrollTo(0,600)");
//		System.out.println("window scroll done!");
//		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		System.out.println("window scroll done!");
//		
//		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight,0)");
//		System.out.println("scroll up");
	}

}
