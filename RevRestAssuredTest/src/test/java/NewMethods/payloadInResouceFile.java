package NewMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

import java.io.File;

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





public class payloadInResouceFile {
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
  public void PostTest() 
  {
	  File file = new File("src/main/resources/workSpace.json");
	  given()
	  		.body(file)
	  .when()
	  		.post("/workspaces")
	  .then()
	  		.log().all()
	  		.assertThat()
	  		.body("workspace.name", equalTo("etg-api-2"));
  }
  }


