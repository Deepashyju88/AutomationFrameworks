package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class User_getpostPutDelet {
	
	String id;
  @Test(priority=1)
  public void createUser() {
	  
	  PojoDemo pojo = new PojoDemo();
	  pojo.setName("Anupama");
	  pojo.setJob("Enggineer");
	  
	  id=given()
	  		.contentType("Application/json")
	  		.body(pojo)
	  		
	  .when()
	  		.post("https://reqres.in/api/users")
	  		.jsonPath().get("id");
	  
	  System.out.println("user craeted with id : " +id);
	  
	  
  }
  
  @Test(priority=2)
  public void getUser() {
	  
	  given()
	  
	  .when()
	  		.get("https://reqres.in/api/users/"+id)
	  		
	  .then()	
	  		.log().body();
	  
	  System.out.println("user get te same id :"+id);
	  
	  
  }
  
  @Test(priority=3)
  public void PutUser() {
	  
	  PojoDemo poj = new PojoDemo();
	  	poj.setName("Anil");
	  	poj.setJob("dr");
	  	
	  	
	  given()
	  	.contentType("Application/json")
	  	.body(poj)
	  	
	  .when()
	  	.put("https://reqres.in/api/users/"+id)
	  	
	  .then()
	  	.statusCode(200)
	  	.log().body();
	  
	  System.out.println("in modification get the same id: "+id);
  }
  
  @Test(priority=4)
  public void DeleteUser() {
	  
	  given()
	  .when()
	  		.delete("https://reqres.in/api/users/"+id)
	  .then()
	  		.statusCode(204);
	  System.out.println("delete get the same id : "+id);
  }
}
