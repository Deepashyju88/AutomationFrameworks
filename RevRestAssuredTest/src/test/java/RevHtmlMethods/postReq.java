package RevHtmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class postReq {
  @Test(priority=1)
  public void hashmapdemo() {
	  
	  HashMap<String, Object> data = new HashMap<String, Object>();
	  data.put("name", "priyanka");
	  data.put("Job", "QA");
	  
	  
	  given()
	  		.contentType("application/json")
	  		.body(data)
	  .when()
	  		.post("https://reqres.in/api/users")
	  .then()
	  		.statusCode(201)
	  		.log().all();
  }
  
  @Test(priority=2)
  public void post_pojo() {
	  
	  pojoClass pojo = new pojoClass();
	  pojo.setJob("QA");
	  pojo.setName("Deepa");
	  
	  given()
	  		.contentType("application/json")
	  		.body(pojo)
	  .when()
	  		.post("https://reqres.in/api/users")
	  .then()
	  		.statusCode(201)
	  		.log().all();
	  
	  
	  
  }
}
