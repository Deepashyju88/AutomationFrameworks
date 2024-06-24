package Assignment;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Assin_2 {
  @Test
  public void delete() 
  {
	  given()
	  
	  .when()
	  		.delete("https://reqres.in/api/users/2")
	  		
	  .then()
	  		.assertThat()
	  		.statusCode(204)
	  		.log().status()
	  		.log().body();
  }
}
 