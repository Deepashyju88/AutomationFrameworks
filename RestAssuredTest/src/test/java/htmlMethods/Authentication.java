package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Authentication {
  @Test(priority=1)
  public void basicAuth() 
  {
	  
	  given()
	  		.auth().basic("postman","password")
	  
	  .when()
	  	.get("https://postman-echo.com/basic-auth")
	  
	  .then()
	  	.statusCode(200)
	  	.body("authenticated", equalTo(true))
	  	.log().body();
	  
	  System.out.println("Basic Autherisation complted!");
  }
  
  
  
  @Test(priority=2)
  public void digestAuth() 
  {
	  
	  given()
	  		.auth().digest("postman","password")
	  
	  .when()
	  	.get("https://postman-echo.com/basic-auth")
	  
	  .then()
	  	.statusCode(200)
	  	.body("authenticated", equalTo(true))
	  	.log().all();
	  
	  System.out.println("Digest Autherisation complted!");
  }
  
  @Test(priority=3)
  public void preemptiveAuth() 
  {
	  
	  given()
	  		.auth().preemptive().basic("postman","password")
	  
	  .when()
	  	.get("https://postman-echo.com/basic-auth")
	  
	  .then()
	  	.statusCode(200)
	  	.body("authenticated", equalTo(true))
	  	.log().all();
	  
	  System.out.println("Preemptive Autherisation complted!");
  }
  
  @Test(priority=4)
  public void BTockenAuth() 
  {
	  
	  given()
	  		.header("Authorization","Bearer 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")
	  .when()
	  	.get("https://api.github.com/user/repos")
	  
	  .then()
	  	.log().all();
	  
	  System.out.println("Bearer Autherisation complted!");
  }
  
  
  @Test(priority=5)
  public void Auth2Auth() 
  {
	  
	  given()
	  		.auth().oauth2("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")
	  .when()
	  	.get("https://api.github.com/user/repos")
	  
	  .then()
	  	.log().all();
	  
	  System.out.println("Auth 2.0 Autherisation complted!");
  }
}
