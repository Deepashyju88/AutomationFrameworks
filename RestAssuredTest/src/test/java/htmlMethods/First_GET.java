package htmlMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First_GET {
  @Test
  public void getRequest_SingleUser() {
	  
	 // https://reqres.in/api/users/2
	  
	  Response res = RestAssured.get("https://reqres.in/api/users/2");
	  int statusCode = res.getStatusCode();
	  System.out.println("the response status code is : "+ statusCode);
	  
	  Assert.assertEquals(statusCode, 200, "fail status code not match");
	  System.out.println("status code matched sucessfully");
	  System.out.println("session id " + res.sessionId());
	  System.out.println("statusline"+ res.statusLine());
	  
	  
  }
}
