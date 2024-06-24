package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo_4_InvocationCount {
  @Test(priority=1)
  public void EntrolFortheCourse() 
  {
	  System.out.println("Student entrol for the course");
  }
  
  @Test(priority=2)
  public void Training() 
  {
	  System.out.println("Student entrol for the Training");
  }
  
  @Test(priority=3,invocationCount=3)
  public void PlacementCall() 
  {
	  System.out.println("Student get palcements");
  }
}
