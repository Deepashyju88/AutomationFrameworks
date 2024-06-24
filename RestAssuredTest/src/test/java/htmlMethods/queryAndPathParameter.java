package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class queryAndPathParameter {
//  //@Test
//  public void testparameter() {
//	  
//	  given()
//	  		.pathParam("path","users")
//	  		.queryParam("page",2)
//	  .when()
//	  		.get("https://reqres.in/api/{path}")
//	  .then()
//	  		.log().all();
//  }
  
  @Test
  public void testparameter2() {
	  given()
	  		.pathParam("path", "users")
	  		.queryParam("page",2)
	  .when()
	  		.get("https://reqres.in/api/{path}")
	  .then()
	  		.statusCode(200)
	  		.log().all();
  }
}
