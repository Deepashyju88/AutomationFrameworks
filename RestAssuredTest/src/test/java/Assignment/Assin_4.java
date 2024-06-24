package Assignment;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Assin_4 {
  @Test
  public void auth_2_0() 
  {
	  given()
	  		.auth().oauth2("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")
	  .when()
	  		.get("https://api.github.com/user/repos")
	  
	  .then()
	  		.statusCode(200)
	  		.log().all();
	  
	  System.out.println("Auth 2.0 Autherisation complted!");
  }
}
