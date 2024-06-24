package testNgDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependsOnMethod {
  @Test(priority=1)
  public void Registration() 
  {
	  System.out.println("User must be registered");
	  boolean status = false;
	  Assert.assertTrue(status);
  }
  
  @Test(priority=2,dependsOnMethods="Registration")
  public void Login() 
  {
	  System.out.println("The login only after registration");
  
  }
}
