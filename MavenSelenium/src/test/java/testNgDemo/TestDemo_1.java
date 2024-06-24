package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo_1 {
  @Test(priority = -2)
  public void TestCase_1() 
  {
	  System.out.println("First test case");
  }
  
  @Test(priority = 1)
  public void TestCase_2()
  {
	  System.out.println("Second test case");
  }
  
  @Test(priority = 5, enabled = false)
  public void TestCase_3()
  {
	  System.out.println("3 test case");
  }
  
  @Test(priority = 1)
  public void TestCase_4()
  {
	  System.out.println("4 test case");
  }
}
