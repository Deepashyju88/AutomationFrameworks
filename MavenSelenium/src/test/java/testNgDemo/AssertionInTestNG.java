package testNgDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {
  @Test
  public void HardAssertionTest() 
  {
	  String act = "Selenium webdriver is webUI automation library";
	  
	  String exp = "selenium webdriver is webUI automation library";

	  AssertJUnit.assertEquals(act, exp,"Fail : Strings are not equal");
	  
	  System.out.println("Pass : The strings are equal ");
  }
  
  @Test
  public void SoftAssertionTest() 
  {
	  System.out.println("Soft assertion test case passed");
  
  }
  
}
