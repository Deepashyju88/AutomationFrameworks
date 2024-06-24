package Assignment;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Assi_1 {
  @Test(priority=1)
  public void Post_HashMap()
  {
	  HashMap<String, Object> data = new HashMap<String, Object>();
	  data.put("name", "Malavika");
	  data.put("job", "QA");
	  
	  given()
	  	.contentType("Application/json")
	  	.body(data)
	  
	  .when()
	  		.post("https://reqres.in/api/users")
	  		
	  .then()
	  		.assertThat()
	  		.statusCode(201)
	  		.log().status()
	  		.log().all();
  }
  
  
  @Test(priority=2)
  public void Post_Pojo()
  {
	  Assin_1_Pojo pojo = new Assin_1_Pojo();
	  pojo.setName("SaiKrishana");
	  pojo.setJob("developer");
	  
	  given()
	  		.contentType("Application/json")
	  		.body(pojo)
	  		
	  .when()
	       .post("https://reqres.in/api/users")

	  .then()
	  		.assertThat()
	  		.statusCode(201)
	  		.log().status()
	  		.log().all();
	  
  }
  
}
