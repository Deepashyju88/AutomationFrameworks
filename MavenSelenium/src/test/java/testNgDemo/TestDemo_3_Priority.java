package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo_3_Priority {
  @Test(priority=2)
  public void Login() 
  {
	  System.out.println("The customer LogedIn");
  }
  
  @Test(priority=1,description=("description -registration"))
  public void Register() 
  {
	  System.out.println("The customer Register");
  }
  
  @Test(priority=3,description=("description -searchproduct"))
  public void SearchforProduct() 
  {
	  System.out.println("The customer SearchforProduct");
  }
  
  @Test(priority=4)
  public void AddtoCart() 
  {
	  System.out.println("The customer AddtoCart");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
