package RevHtmlMethods;


import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;


import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
public class headerValid {
  @Test(enabled=false)
  public void HeaderDemo() {
	  
	  given()
	  .when()
	  		.get("https://www.google.com")
	  		
	  .then()
	  		.log().all();
  }
  
  @Test
  public void testheader()
  {
	  Response res = given()
			  .when().get("https://www.google.com");
			  
		String header = res.getHeader("Content-Type");
		Assert.assertEquals(header,"text/html; charset=ISO-8859-1", "Fail header mismatch");
		System.out.println("header matched");
  }
  
  @Test
  public void test_cookies()
  {
	  	Response res = given()
	  		.when().get("https://www.google.com");
	  	
	  	Map<String,String> cooky = res.getCookies();
	  	
	  	String ACECooky = res.getCookie("AEC");
	  	Assert.assertFalse(ACECooky.contains("jdhfhskjjvhkjvlkf"));
	  	System.out.println();
	  	
	  	
	  	
	  	
	  		
  }
}
