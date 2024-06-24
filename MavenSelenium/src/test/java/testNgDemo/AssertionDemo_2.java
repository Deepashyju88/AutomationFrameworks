package testNgDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo_2 {
  @Test(priority=1)
  public void AssertionTrue() 
  {
	  String act = "Selenium is an automation libary";
	  
	  String exp = "Test UI";
	  
//	  //AssertTrue
//	  Assert.assertTrue(act.contains(exp), "Fail : the string not match");
//	  System.out.println("Pass : the string matches");

	  //Assertfalse
	  Assert.assertFalse(act.contains(exp)," Fail : the string contain automation ");
	  System.out.println("Pass : actual string not contain Test UI");
	  
  }
  
  @Test(priority=2)
  public void SoftAssertion()
  {
	  SoftAssert sf = new SoftAssert();
	  int a =100, b= 200;
	  
//	  //AssertEquals()
//	  sf.assertEquals(a, b, "Fail : the a and b are not equal");
//	  System.out.println("Pass : the number a and b are equal");
//	  System.out.println("this is soft assertion test case");

//	  //AssertTrue
//	  sf.assertTrue(a==b, "Fail : the a and b are not equal");
//	  System.out.println("Pass : the number a and b are equal");
//	  System.out.println("this is soft assertion test case");
	  
	  //AssertFalse
	  Assert.assertFalse(a==b,"Fail : the a and b are not equal" );
	  System.out.println("Pass : the number a and b are equal");
	  System.out.println("this is soft assertion test case");
	  sf.assertAll();
	  
	  
	  
  }
  
  
}
