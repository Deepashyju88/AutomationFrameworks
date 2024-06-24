package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDisable {
  @Test
  public void TestCase_1() 
  {
	  System.out.println("This is my test case no 1");
  }
  
  @Test
  public void TestCase_2() 
  {
	  System.out.println("This is my test case no 2");
  }
  
  @Test(enabled=false)
  public void TestCase_3() 
  {
	  System.out.println("This is my test case no 3");
  }
  @Test
  public void TestCase_4() 
  {
	  System.out.println("This is my test case no 4");
  }
}
