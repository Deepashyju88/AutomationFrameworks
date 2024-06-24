package scenario_2.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void doGeturl() {
	  String Curl = lp.getUrl();
	  System.out.println(Curl);
	  
  }
  
  @Test(priority=2)
  public void startLogin() {
	  
	  lp.doLogin("Admin", "admin123");
	  Assert.assertTrue(lp.getUrl().contains("dashboard"), "Fail : login unsucessful");
	  System.out.println("Login sucessfully");
	  
	  
  }
  
}
