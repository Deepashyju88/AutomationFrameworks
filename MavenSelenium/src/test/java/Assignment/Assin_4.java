//4. Implement a test case using WebDriver to validate the functionality of a registration form.

package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assin_4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		String title1=driver.getTitle();
		Assert.assertTrue(title1.contains("Shopping"),"Fail :There is a mismatch in the title of the Amazon homepage.");
		System.out.println("The title on the Amazon homepage matches.");
		
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		if (ele.isDisplayed())
		{
		System.out.println("Signup link displayed : " + ele.isDisplayed());
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Start here.")).click();
		}
		String curl = driver.getCurrentUrl();
		Assert.assertTrue(curl.contains("register"),"Fail : Unable to open the registration page");
		System.out.println("Registration page loaded sucessfully");
		
		WebElement  name = driver.findElement(By.id("ap_customer_name"));
		if (name.isDisplayed())
		{
		System.out.println("Registration name field displayed? : " + name.isDisplayed());
		name.sendKeys("Sreehari");
		}
		
		WebElement cd = driver.findElement(By.name("countryCode"));
		
		Select se = new Select(cd);
		System.out.println("is multiple select option available for country code? : "+se.isMultiple());
	
		List <WebElement> allopt = se.getOptions();
		for (WebElement i: allopt)
		{
			if (!i.isSelected())
				{
				if (i.getText().contains("+81"))
					{
						i.click();
						break;
					}

				}
		}
		WebElement phone = driver.findElement(By.id("ap_phone_number"));
		if (phone.isDisplayed())
		{
			System.out.println("Phone number field displayed : "+phone.isDisplayed());
			phone.sendKeys("090-1234-5678");
		}
		
		WebElement email = driver.findElement(By.name("secondaryLoginClaim"));
		if (email.isDisplayed())
		{
			System.out.println("Email field displayed : "+email.isDisplayed());
			email.sendKeys("Nichuwe@gmail.com");
		}
		
		WebElement password = driver.findElement(By.id("ap_password"));
		if (password.isDisplayed())
		{
			System.out.println("Password field displayed : "+password.isDisplayed());
			password.sendKeys("Passw@123");
		}
		
		screenShot.takeScreenShot(driver);
		WebElement verify = driver.findElement(By.id("continue"));
		if (verify.isDisplayed() && verify.isEnabled())
		{
			System.out.println("verify button Enabled and displayed :" + verify.isDisplayed() );
			verify.click();
		}

		
		Assert.assertTrue(driver.getTitle().contains("Authentication required"),"fail : signin failed");
		System.out.println("Registration is complete upon successfully solving the puzzle!");
		
		driver.quit();
	}

}
