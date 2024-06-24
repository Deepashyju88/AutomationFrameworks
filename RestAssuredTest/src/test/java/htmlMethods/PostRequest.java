package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PostRequest {
  @Test(priority=1)
  public void posHashmap() {
	  
	  HashMap<String,Object> data = new HashMap<String,Object>();
	  data.put("name","Nirupama");
	  data.put("job","QA");
	  
	  given()
	  	.contentType("Application/json")
	  	.body(data)
	  	
	  .when()
	  	.post("https://reqres.in/api/users")
	  	
	  .then()
	  	.log().all();
  }
  
  @Test(priority=2)
  public void PojoMethod()
  {
	  
	  PojoDemo pojo =new PojoDemo();
	  pojo.setName("Sarang");
	  pojo.setJob("banker");
	  
	  given()
	  	.contentType("Application/json")
	  	.body(pojo)
	  	
	  .when()
	  	.post("https://reqres.in/api/users")
	  	
	  .then()
	  	.statusCode(201)
	  	.log().all();
	  
	  
  }
}
