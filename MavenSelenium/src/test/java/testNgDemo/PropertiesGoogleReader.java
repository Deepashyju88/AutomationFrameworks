package testNgDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.PropertiesReader;

public class PropertiesGoogleReader {
  @Test
  public void readFile() throws IOException 
  {
	  PropertiesReader p1 = new PropertiesReader();
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get(p1.getdata("url"));
	  
	  driver.findElement(By.name(p1.getdata("name"))).sendKeys(p1.getdata("value"), Keys.ENTER);
	  Assert.assertTrue(driver.getTitle().contains(p1.getdata("title")), "Fail : Title missmatch");
	  System.out.println("Title matched!");
	  
	  
	  
//	  //file
//	  File f1 = new File("./"+"\\Config.properties");
//	  
//	  //read
//	  FileInputStream fs= new FileInputStream(f1);
//	  
//	  //properties
//	  Properties p1= new Properties();
//	  
//	  //load
//	  p1.load(fs);
	  
//	  System.out.println("Url is "+ p1.getProperty("url"));
//	  System.out.println("Title is " + p1.getProperty("title"));
//	  
  }
}
