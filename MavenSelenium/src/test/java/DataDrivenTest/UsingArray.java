package DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingArray {
	
//	@DataProvider(name="testdata1")
//	public Object[][] testData()
//	{
//		Object data[][] = {{"Admin", "admin123"},{"Sarang", "Test123"},{"Admin","admin123"},{"pooja","test456"}};
//		return data;
//	}
	
  @Test(dataProvider="testdata1", dataProviderClass=CustomData.class)
  public void LoginTest(String un, String pwd) 
  {
	  System.out.println("the user name is "+ un);
	  System.out.println("Password is "+ pwd);
  }
}
