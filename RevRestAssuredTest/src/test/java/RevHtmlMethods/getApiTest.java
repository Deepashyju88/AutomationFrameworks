package RevHtmlMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class getApiTest {
  @Test(priority = 1)
  public void firstGet() 
  {
	  given()
		.baseUri("https://api.postman.com")
		.header("X-Api-Key" , "PMAK-666b3087421ad60001a1213c-8ead6d846937492b5f6958e281e7f86cfc")
		
	.when()
		.get("workspaces")
	.then()
		.statusCode(200)
		.assertThat()
		.log().all();
  }
  
  @Test(priority = 2)
  public void secondGet() 
  {
	  given()
		.baseUri("https://api.postman.com")
		.header("X-Api-Key" , "PMAK-666b3087421ad60001a1213c-8ead6d846937492b5f6958e281e7f86cfc")
		
	.when()
		.get("workspaces")
	.then()
		.statusCode(200)
		.assertThat()
		.log().all()
		.body("workspaces.name", hasItems("My Workspace", "etg", "StarAgile012","etg-api"),
				"workspaces[2].createdBy", equalTo("16309928"),
				"workspaces.size()", equalTo(4)
				);
  }
  
  @Test(priority = 3)
  public void ThirdGet() 
  {
	  	Response res = given()
		.baseUri("https://api.postman.com")
		.header("X-Api-Key" , "PMAK-666b3087421ad60001a1213c-8ead6d846937492b5f6958e281e7f86cfc")
		
	.when()
		.get("workspaces")
	.then()
		.statusCode(200)
		.assertThat()
		.extract()
		.response();
	  	System.out.println("Response is : " + res.asString());
	  	System.out.println("Response for single point name : " + res.path("workspaces[0].name"));
  }
  
  @Test(priority = 4)
  public void resAsStringGet() 
  {
	  	String res = given()
		.baseUri("https://api.postman.com")
		.header("X-Api-Key" , "PMAK-666b3087421ad60001a1213c-8ead6d846937492b5f6958e281e7f86cfc")
		
	.when()
		.get("workspaces")
	.then()
		.statusCode(200)
		.assertThat()
		.extract()
		.response().asString();
	  	System.out.println("Json Path : "+ JsonPath.from(res).getString("workspaces[2].name"));
//	  	System.out.println("Response is : " + res.asString());
//	  	System.out.println("Response for single point name : " + res.path("workspaces[0].name"));
  }
  
  @Test(priority = 5)
  public void resAsStringNameGet() 
  {
	  	String name = given()
		.baseUri("https://api.postman.com")
		.header("X-Api-Key" , "PMAK-666b3087421ad60001a1213c-8ead6d846937492b5f6958e281e7f86cfc")
		
	.when()
		.get("workspaces")
	.then()
		.statusCode(200)
		.assertThat()
		.extract()
		.response().path("workspaces[3].name");
	  	System.out.println("response name  : "+ name);
//	  	System.out.println("Response is : " + res.asString());
//	  	System.out.println("Response for single point name : " + res.path("workspaces[0].name"));
  }
  
  
  @Test(priority = 6)
  public void hamrest_Assertion() 
  {
	  	String name = given()
		.baseUri("https://api.postman.com")
		.header("X-Api-Key" , "PMAK-666b3087421ad60001a1213c-8ead6d846937492b5f6958e281e7f86cfc")
		
	.when()
		.get("workspaces")
	.then()
		.statusCode(200)
		.assertThat()
		.extract()
		.response().path("workspaces[2].name");
	  	System.out.println("response name  : "+ name);
	  	
	  	assertThat(name, equalTo("StarAgile012"));
	  	
	  	//using TestNg
	  	
	  	Assert.assertEquals(name,"StarAgile012");
//	  	System.out.println("Response is : " + res.asString());
//	  	System.out.println("Response for single point name : " + res.path("workspaces[0].name"));
  }
  
}
