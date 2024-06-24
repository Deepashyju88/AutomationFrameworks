package testNgDemo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnotationDemo {
  @Test(priority=1)
  public void Registration() 
  {
	  System.out.println("this is for registration");
  }
  
  @Test(priority=2)
  public void login() 
  {
	  System.out.println("this is for login");
  }
  
  @Test(priority=3)
  public void logout() 
  {
	  System.out.println("this is for logout");
  }
  
  
  //Annotation
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("before methord will execute before every method");
  }
  
  @AfterMethod
  public void aftMethod()
  {
	  System.out.println("After methord will execute after every method");
  }
  
  @BeforeClass
  public void befClass()
  {
	  System.out.println("beforeclass  will execute only before first testcase");
  }
  	
  @AfterClass
  public void aftClass()
  {
	  System.out.println("afterclass  will execute only after last testcase");
  }
  
  @BeforeTest
  public void befTest()
  {
	  System.out.println("before test will run only before the first class");
  }
  
  @AfterTest
  public void aftTest()
  {
	  System.out.println("after test will run only after the all class");
  }
  	 
  @BeforeSuite
  public void befSuite()
  {
	  System.out.println("before suite will run before test");
  }
  
  @AfterSuite
  public void aftfSuite()
  {
	  System.out.println("After suite will run after test");
  }
   
  
  
  
  
  
  
}
