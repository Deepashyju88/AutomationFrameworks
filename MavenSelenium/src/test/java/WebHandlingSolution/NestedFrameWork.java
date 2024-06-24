package WebHandlingSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameWork {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
//		//parent frame or top frame
//		driver.switchTo().frame(0);
//		
//		//Left frame
//		driver.switchTo().frame("frame-left");
		
		//switching from one frame to another in single line
		driver.switchTo().frame(0).switchTo().frame("frame-left");
		
		String  fFr = driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();		
		System.out.println("First left frame value is : " + fFr);
		System.out.println(driver.getPageSource());
		
		//to top frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
		String Mfr= driver.findElement(By.xpath("//body[normalize-space()='MIDDLE']")).getText();
		System.out.println("the middle frame : " + Mfr);
		
		System.out.println("*************************************************");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(0).switchTo().frame("frame-right");
		String Rfr= driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText();
		System.out.println(Rfr);
		System.out.println(driver.getPageSource());
		System.out.println("*****************************************************");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		String Bfr= driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']")).getText();
		System.out.println(Bfr);
		System.out.println(driver.getPageSource());
		
	}

}
