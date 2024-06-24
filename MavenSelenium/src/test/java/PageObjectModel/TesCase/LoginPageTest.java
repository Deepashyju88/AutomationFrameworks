package PageObjectModel.TesCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.Page.LoginPage;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void ferifyUrl() 
  {
	  //LoginPage lp = new LoginPage();
	  String url = lp.getUrl();
	  Assert.assertTrue(url.contains("hrmlive"),"Fail url");
	  System.out.println("the url is corect");
  }
  
  @Test(priority=2)
  public void ferifyTitle() 
  {
	  String actTitle= lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("OrangeHRM"),"The title is not match");
	  System.out.println("The title is matching");
  }
  
  @Test(priority=3)
  public void ferifyLogin() 
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "The login failed");
	  System.out.println("login done sucessfully");
  }
}
