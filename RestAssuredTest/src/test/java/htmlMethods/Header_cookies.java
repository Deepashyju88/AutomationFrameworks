package htmlMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class Header_cookies {
  @Test(priority=1)
  public void HeaderValidation() {
	  
	  given()
	  
	  .when()
	  		.get("https://www.google.com")
	  		
	  .then().log().headers();
  }
  
  @Test(priority=2)
  public void Headertest() {
	  Response res= given()
	  
	  .when()
	  		.get("https://www.google.com");
	  
	  String ActRes = res.getHeader("Content-Type");
	  Assert.assertEquals(ActRes, "text/html; charset=ISO-8859-1");
	  System.out.println("Header validated");
	  		
	  
  }
  
  @Test(priority=3)
  public void CookiValid()
  {
	  	Response res = given()
			  		.when().get("https://www.google.com");
			  		
		
	  	Map<String, String> all = res.getCookies();	
	  	System.out.println(all);
	  
	  	String actCookies = res.getCookie("AEC");
	  	Assert.assertFalse(actCookies.contains("Ae3NU9MImxbIwDeQX"));
	  	System.out.println("Pass: cookies are not matchS");
	  	
	  	
	  	
	  	
  }
  
}
