package RevHtmlMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;





public class AutomatePost {
  @Test
  public void BeforClass() 
  {
	  
	  RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder().
			  setBaseUri("https://api.postman.com").
			  addHeader("X-Api-Key" , "password")
	  		  .log(LogDetail.ALL);
	  RestAssured.requestSpecification = requestSpecBuilder.build();
	  
	  ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder().
			  expectStatusCode(200).
	  		  expectContentType(ContentType.JSON).
	  		  log(LogDetail.ALL);
	  RestAssured.responseSpecification = responseSpecBuilder.build();
	  
	  
  }

	  @Test
	  public void Vaildate_post() 
	  {
		  String payload = (" {\"workspace\": {\n"
		  		+ "        \"id\": \"2016f2ae-10ef-472a-80a7-aa17c275df34\",\n"
		  		+ "        \"name\": \"etg-api\",\n"
		  		+ "        \"type\": \"personal\",\n"
		  		+ "        \"description\": \"this is etg api\"\n"
		  		+ "        \n"
		  		+ "        \n"
		  		+ "    }\n"
		  		+ "}");
		  
		  given()
		  		.body(payload)
		  		
		  .when()
		  		.post("/workspaces")
		  .then()
		  	.assertThat()
		  	.body("workspace.name", equalTo("etg-api"));
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
}
