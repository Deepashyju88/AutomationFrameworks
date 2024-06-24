package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class revision {
  @Test(priority=1)
  public void compltTraing() {
	  
	  System.out.println("traing complter");
	  
	  String act = "HAllo all";
	  String exp = "HAllo all";
	  Assert.assertEquals(act, exp,"fail : not match");
	  System.out.println("matched ");
  
  }
  
  @Test(priority=2, description="study")
  public void studied() {
	  
	  System.out.println("studied complter");
  }
  
  @Test(priority=3, invocationCount=2)
  public void placed() {
	  
	  
	  System.out.println("placed complter");
  }
}
