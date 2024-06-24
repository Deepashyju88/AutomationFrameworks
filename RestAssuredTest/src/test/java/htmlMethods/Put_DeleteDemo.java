package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Put_DeleteDemo {
  @Test(priority=1)
  public void putRequest() {
	  System.out.println("put request***********************");
	  PojoDemo poj = new PojoDemo();
	  	poj.setName("Anil");
	  	poj.setJob("dr");
	  	
	  	
	  given()
	  	.contentType("Application/json")
	  	.body(poj)
	  	
	  .when()
	  	.put("https://reqres.in/api/users/2")
	  	
	  .then()
	  	.statusCode(200)
	  	.log().body();
	  
  }
  
  
  @Test(priority=2)
  public void patchRequest() {
	  
	  System.out.println("patch request***********************");
	  
	  PojoDemo poj = new PojoDemo();
	  	poj.setName("Kumar");
	
	  	
	  	
	  given()
	  	.contentType("Application/json")
	  	.body(poj)
	  	
	  .when()
	  	.patch("https://reqres.in/api/users/2")
	  	
	  .then()
	  	.statusCode(200)
	  	.log().body();
	  
  }
  
  @Test(priority= 3)
  public void DeleteReq()
  {
	  
	  given()
	  
	  .when()
	  	.delete("https://reqres.in/api/users/2")
	  	
	  .then()	
	  	.statusCode(204)
	  	.log().all();
  }
}
