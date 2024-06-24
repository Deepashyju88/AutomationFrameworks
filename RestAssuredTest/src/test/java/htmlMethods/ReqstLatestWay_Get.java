package htmlMethods;

import org.testng.annotations.Test;


import jdk.internal.net.http.common.Log;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class ReqstLatestWay_Get {
  @Test(enabled=false)
  public void first_get() {
	  given()
	  
	  .when().get("https://reqres.in/api/users/2")
	  
	  .then()
	  		.assertThat()
	  		.statusCode(200)
	  		.body("data.id", equalTo(2))
	  		.body("data.first_name",equalTo("Janet"))
	  		.log().body();
	  		//.log().all(); 
	  
  }

@Test(enabled=false)
public void getListofUsers()
{
	given()
	
	.when().get("https://reqres.in/api/users?page=2")
	
	.then().statusCode(200)
	.body("page",equalTo(2))
	.body("data.id[2]",equalTo(9))
	.body("data.first_name[5]",equalTo("Rachel"))
	.log().body();
}

@Test
public void getTestMethods()
{
	given()
	
	.when().get("https://reqres.in/api/users?page=2")
	
	.then()
		.statusCode(200)
		.body("data.id",hasItems(7,8,11,12))
		//.body("data.id", contains(7,8,9))// fail due to incomplete data
		.body("data.id",contains(7, 8, 9, 10, 11, 12))
		.log().body();
}

}
