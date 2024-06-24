package RevHtmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class sameUserAllflow {
	
	String id;
  @Test(priority=1)
  public void postDemo() {
	  
	  pojoClass pojo = new pojoClass();
	  pojo.setName("Sarang Thrivedi");
	  pojo.setJob("QA");
	  
	  
	  	id = given()
	  		.contentType("application/json")
	  		.body(pojo)
	  .when()
	  		.post("https://reqres.in/api/users")
	  		.jsonPath().get("id");
	  
	  
	  System.out.println("the user id is : "+ id);
	  
  }
  
  @Test(priority=2)
  public void getuser() {
	  
	  given()
	  .when()
	  		.get("https://reqres.in/api/users/"+ id)
	  .then()
	  		.log().body();
	  
	  
  }
  
  @Test(priority=3)
  public void putDemo() {
	  pojoClass pojo = new pojoClass();
	  pojo.setName("Annesh K");
	  pojo.setJob("Sr Manager");
	  
	  
	  	given()
	  		.contentType("application/json")
	  		.body(pojo)
	  .when()
	  		.put("https://reqres.in/api/users/")

	  		
	  .then()
	  	.statusCode(200)
	  	.log().body();
	  
  }
  
  @Test(priority=4)
  public void deletUser() {
	  given()
	  .when()
	  		.delete("https://reqres.in/api/users/"+ id)
	  .then()
	  		.log().body();
	  
  }
}
