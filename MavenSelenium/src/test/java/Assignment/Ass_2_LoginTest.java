package Assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ass_2_LoginTest extends Ass_2_BaseClass
{
  @Test(priority=1)
  public void verifyUrl()
  {
	  String curl= lp.getloginUrl();
	  Assert.assertTrue(curl.contains("login"),"Fail : login page not loaded");
	  System.out.println("Login page loaded sucessfully");
  
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String title = lp.getTitle();
	  Assert.assertTrue(title.contains("account"), "Fail : Title mismatched");
	  System.out.println("Title matched ");
  }
  
  @Test(priority=3)
  public void verifyLogin() throws InterruptedException
  {
	  lp.doLogin("AshokDaneesh@gmail.com", "Daneesh@456");
	  System.out.println("Login sucessfully");
  }
}
