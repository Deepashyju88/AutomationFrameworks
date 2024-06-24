package Assignment;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Assin_3 {
  @Test(priority=1)
  public void firstPage() 
  {
	  given()
	  
	  .when()
	  		.get("https://reqres.in/api/users?page=1")
	  		
	  .then()
	  		.assertThat()
	  		.statusCode(200)
	  		.body("page",equalTo(1))
	  		.body("per_page",equalTo(6))
	  		.log().body();
  }
  
  @Test(priority=2)
  public void secondPage() 
  {
	  given()
	  
	  .when()
	  		.get("https://reqres.in/api/users?page=2")
	  		
	  .then()
	  		.assertThat()
	  		.statusCode(200)
	  		.body("page", equalTo(2))
	  		.body("per_page",equalTo(6))
	  		.log().body();
  }
}
