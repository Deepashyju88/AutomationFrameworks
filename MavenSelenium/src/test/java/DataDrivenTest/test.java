package DataDrivenTest;

import org.testng.annotations.Test;

public class test {
  @Test
  public void test1()
  {
	  System.out.println("test 1");
  }
  
  @Test(priority =1 )
  public void test2()
  {
	  System.out.println("test 2");
  }
  @Test(priority = 5)
  public void test3()
  {
	  System.out.println("test 3");
  }
}
