package htmlMethods;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialisation_deserialisation {
  @Test(priority= 1)
  public void test_serialisation() throws JsonProcessingException {
	  
	  //object
	  PojoDemo pojo = new PojoDemo();
	  pojo.setName("jay");
	  pojo.setJob("QA");
	  
	  ObjectMapper map = new ObjectMapper();
	  
	  String json= map.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
	  System.out.println(json);
  }
  
  @Test(priority= 2)
  public void de_serialisation() throws JsonMappingException, JsonProcessingException
  {
	  String json = "{\n"
	  		+ "  \"name\" : \"jay\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
 
	  ObjectMapper map = new ObjectMapper();
	  PojoDemo p1 = map.readValue(json, PojoDemo.class);
	  System.out.println(p1.getName()+ " : "+ p1.getJob());

  
  }
}
