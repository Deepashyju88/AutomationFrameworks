package RevHtmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Rev_Auth {
  @Test
  public void BasicAuth() {
	  
	  given()
	  		.auth().basic("postman","password")
	  .when()
	  		.get("https://postman-echo.com/basic-auth")
	  .then()
	  		.statusCode(200)
	  		.body("authenticated", equalTo(true))
	  		.log().all();
  }
  
  
  @Test
  public void DigestAuth() {
	  
	  given()
	  		.auth().digest("postman","password")
	  .when()
	  		.get("https://postman-echo.com/digest-auth")
	  .then()
	  		.statusCode(200)
	  		.body("authenticated", equalTo(true))
	  		.log().all();
  }
  
  @Test
  public void preemitiveAuth() {
	  
	  given()
	  		.auth().preemptive().basic("postman","password")
	  .when()
	  		.get("https://postman-echo.com/basic-auth")
	  .then()
	  		.statusCode(200)
	  		.body("authenticated", equalTo(true))
	  		.log().all();
  }
}
