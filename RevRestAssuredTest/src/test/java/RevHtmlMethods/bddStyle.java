package RevHtmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class bddStyle {
  //@Test
  public void BDDDemoApi() {
	  
	  given()
	  .when().get("https://reqres.in/api/users/2")
	  .then()
	  		.assertThat()
	  		.statusCode(200)
	  		.body("data.id", equalTo(2))
	  		.body("data.first_name", equalTo("Janet"))
	  		.log().all();
  }
  
  @Test(enabled=false)
  public void multipleuser()
  {
	  given()
	  .when()
	  	.get("https://reqres.in/api/users?page=2")
	 .then()
	 	.statusCode(200)
	 	.body("per_page", equalTo(6))
	 	.body("data.last_name[5]", equalTo("Howell"))
	 	.log().all();
  }
  
  @Test
  public void testGet()
  {
	  given()
	  		.pathParam("path", "users")
	  		.queryParam("page", 2)
	  .when()
	  	.get("https://reqres.in/api/{path}")
	 .then()
	 	.statusCode(200)
	 	.body("data.id", hasItems(7,8,9,11,10,12))
	 	//.body("data.id", contains())
	 	.log().body();
  }
}
 