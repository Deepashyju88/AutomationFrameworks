package RevHtmlMethods;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serialisation_deser {
  @Test
  public void serialisation() throws JsonProcessingException {
	  
	  pojoClass pojo = new pojoClass();
	  
	  pojo.setName("Neelu");
	  pojo.setJob("developer");
	  
	  ObjectMapper map = new ObjectMapper();
	 String jsonobj =  map.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
	 System.out.println(jsonobj);
	 
  }
  
  @Test
  public void deseri() {
	  
	  
	  String json = "{\n"
	  		+ "  \"name\" : \"Neelu\",\n"
	  		+ "  \"job\" : \"developer\"\n"
	  		+ "}";
	  
	  ObjectMapper map = new ObjectMapper();
	  map.readValue(json,pojoClass.Class);
	  
  }
}
