package RevisionGroup;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDem1 {
  @Test(priority = -2,  groups = "smokeTest")
  public void TestCase_22() 
  {
	  System.out.println("22 test case");
  }
  
  @Test(priority = 1,  groups = "functionalTest")
  public void TestCase_23()
  {
	  System.out.println("23 test case");
  }
  
  @Test(priority = 5, groups = "smokeTest")
  public void TestCase_24()
  {
	  System.out.println("24 test case");
  }
  
  @Test(priority = 1, groups = "functionalTest")
  public void TestCase_25()
  {
	  System.out.println("25 test case");
  }
}
