package DataDrivenTest;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class diet {

	public static void main(String[] args) throws InterruptedException {
		 
		ChromeOptions options =new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("autofill.profile_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.dietdirect.com/wonderslim-protein-mashed-potatoes-garlic/WS157-001.html");
		  
//		  private By addBtn = By.xpath("//button[@data-pid='WS157-001']");
//			
//			private By miniCart = By.xpath("//a[@class='minicart-link']");
//			
//			private By viewCart = By.xpath("(//div[@class='mb-3 view-cart'])[1]");
//			
//			
//			private By checkoutBtn = By.xpath("(//a[@role='button'])[19]");
//			
//			private By guestCheckout = By.xpath("//button[@value='cancel-login']");
//			
//			private By guestMailId = By.name("dwfrm_coCustomer_email");
//			private By continueAsGuest = By.xpath("//button[@value='submit-customer']");
//			private By fName = By.id("shippingFirstNamedefault");
//			private By lName = By.id("shippingLastNamedefault");
//			private By Add1 = By.name("dwfrm_shipping_shippingAddress_addressFields_address1");
//			private By state = By.id("shippingStatedefault");
//			private By zipCode = By.id("shippingZipCodedefault");
//			private By phone = By.id("shippingPhoneNumberdefault");
//			private By cityname = By.id("shippingAddressCitydefault");
//			private By submitBtn = By.xpath("(//button[@type='submit'])[3]");
//			
//			private By cardName = By.id("braintreeCardOwnerToDisplay");
//			private By cardNumber = By.id("braintreeCardNumberToDisplay");
//			private By cvv = By.id("braintreeCvvToDisplay");
//			private By expiry = By.id("braintreeExpirationToDisplay");
//			private By reviewOrder = By.xpath("//button[@value='submit-payment']");
			
		  //"2601 West 7th St. Fort Worth","Texas", "75074", "817 877 1977"
	
			
			driver.findElement(By.xpath("//button[@data-pid='WS157-001']")).click();
			driver.findElement(By.xpath("//a[@class='minicart-link']")).click();
			driver.findElement(By.xpath("(//div[@class='mb-3 view-cart'])[1]")).click();
			
			driver.findElement(By.xpath("(//a[@role='button'])[19]")).click();
			driver.findElement(By.xpath("//button[@value='cancel-login']")).click();
			driver.findElement(By.name("dwfrm_coCustomer_email")).sendKeys("sam@gmail.com");
			driver.findElement(By.xpath("//button[@value='submit-customer']")).click();
			
			driver.findElement(By.id("shippingFirstNamedefault")).sendKeys("sam");
			driver.findElement(By.id("shippingLastNamedefault")).sendKeys("John");
			driver.findElement(By.name("dwfrm_shipping_shippingAddress_addressFields_address1")).sendKeys("2601 West 7th St. Fort Worth");
			
			Select dd = new Select(driver.findElement(By.id("shippingStatedefault")));
			dd.selectByValue("TX");
			
			driver.findElement(By.id("shippingAddressCitydefault")).sendKeys("Texas");
			driver.findElement(By.id("shippingZipCodedefault")).sendKeys("75074");
			driver.findElement(By.id("shippingPhoneNumberdefault")).sendKeys("817 877 1977");
			driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
			Thread.sleep(10000);

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			System.out.println(driver.findElement(By.xpath("(//h2[@class='pull-left card-header-custom'])[2]")).getAttribute("id"));
			
			
//			WebElement cardnamed = driver.findElement(By.id("braintreeCardOwnerToDisplay"));
//			String id = cardnamed.getAttribute("id");
			
			//System.out.println(id);
//			
//			 @Test(priority=10)
//			  public void addPaymentDetails() 
//			  {
//				  ip.payment("Sam John","4111 1111 1111 1111","123","05 26");
//				  System.out.println("Order review done successfully");
//			  }
//			
			
//			
//			public void payment(String cName, String cNumber, String cvvValue,String expirydate) 
//			{
//				
//
//				
//				driver.findElement(cardName).sendKeys(cName);
//				driver.findElement(cardNumber).sendKeys(cNumber);
//				driver.findElement(cvv).sendKeys(cvvValue);
//				driver.findElement(expiry).sendKeys(expirydate);
//				driver.findElement(reviewOrder).click();
//			}

	}

}
