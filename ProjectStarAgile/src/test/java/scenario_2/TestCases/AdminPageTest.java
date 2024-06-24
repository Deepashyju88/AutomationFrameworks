package scenario_2.TestCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Scenario_1.Utility;

public class AdminPageTest extends BaseClass 

{
  @Test(priority=1)
  public void Selectoptn()
  {
	  List<WebElement> list = ap.getOption();
	  for (WebElement i :list)
	  {
		  System.out.println(i.getText());
	  }
	  for (WebElement i : list)
			{
				System.out.println(i.getText());
				if(i.getText().contains("Admin"))
				{
					i.click();
					break;
				} 
			}
	  Assert.assertTrue(driver.getCurrentUrl().contains("admin"),"Fail : The function fail to select the Admin option"); 
	  System.out.println("The Admin option selected sucessfully");
  }
  
  
  @Test(priority=2)
  public void SearchUsrNm() throws InterruptedException
  {
	  int meg = ap.searchByUserName("Admin");	  
	  System.out.println("The search message for search by username is : "+meg+ " Record Found");
	  Utility.screenCapture(driver);
  
  }
  
  @Test(priority=3)
  public void SearchUsrRole() throws InterruptedException
  {
	  int meg2 = ap.searchByUserRole("Admin");
	  System.out.println("The search message for search by user role  is : "+ meg2 +" Records Found");
	  Utility.screenCapture(driver);
  }
  
  @Test(priority=4)
  public void SearchUsrStatus() throws InterruptedException
  {
	  int meg3 = ap.searchByUserStatus("Enabled");
	  System.out.println("The search message for search by status is : "+ meg3 +" Records Found");
	  Utility.screenCapture(driver);

  }
  
   
}
