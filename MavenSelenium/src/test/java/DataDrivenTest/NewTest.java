package DataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void verify() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.dietdirect.com/wonderslim-protein-mashed-potatoes-garlic/WS157-001.html");
	  
	  private By addBtn = By.xpath("//button[@data-pid='WS157-001']");
		
		private By miniCart = By.xpath("//a[@class='minicart-link']");
		
		private By viewCart = By.xpath("(//div[@class='mb-3 view-cart'])[1]");
		
		
		private By checkoutBtn = By.xpath("(//a[@role='button'])[19]");
		
		private By guestCheckout = By.xpath("//button[@value='cancel-login']");
		
		private By guestMailId = By.name("dwfrm_coCustomer_email");
		private By continueAsGuest = By.xpath("//button[@value='submit-customer']");
		private By fName = By.id("shippingFirstNamedefault");
		private By lName = By.id("shippingLastNamedefault");
		private By Add1 = By.name("dwfrm_shipping_shippingAddress_addressFields_address1");
		private By state = By.id("shippingStatedefault");
		private By zipCode = By.id("shippingZipCodedefault");
		private By phone = By.id("shippingPhoneNumberdefault");
		private By cityname = By.id("shippingAddressCitydefault");
		private By submitBtn = By.xpath("(//button[@type='submit'])[3]");
		
		private By cardName = By.id("braintreeCardOwnerToDisplay");
		private By cardNumber = By.id("braintreeCardNumberToDisplay");
		private By cvv = By.id("braintreeCvvToDisplay");
		private By expiry = By.id("braintreeExpirationToDisplay");
		private By reviewOrder = By.xpath("//button[@value='submit-payment']");
		
		driver.findElement(addBtn).click();
		driver.findElement(miniCart).click();
		driver.findElement(viewCart).click();
		
		driver.findElement(checkoutBtn).click();
		driver.findElement(guestCheckout).click();
		driver.findElement(guestMailId).sendKeys("sam@gmail.com");
		driver.findElement(continueAsGuest).click();
  }
}
