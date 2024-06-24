package RevHtmlMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getreq {
  @Test
  public void getDemo() {
	  
	  Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	  int statuscode=  res.statusCode();
	  System.out.println(statuscode);
	  Assert.assertEquals(statuscode, 200, "Fail : status code not match");
	  System.out.println("ststus matched");
	  
	  System.out.println(res.sessionId());
	  System.out.println(res.sta);
  }
  
}
