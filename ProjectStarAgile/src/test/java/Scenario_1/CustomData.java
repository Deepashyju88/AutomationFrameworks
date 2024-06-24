package Scenario_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	
	@DataProvider(name="ExcellData")
	public Object[][] FileData()
	{
	File f1 = new File("./"+"\\TestData\\Data.xlsx");
	  FileInputStream fs;
	  XSSFWorkbook wb;
	  Object data[][]= null;
	try {
		fs = new FileInputStream(f1);
		wb = new XSSFWorkbook(fs);

		  //number of rows
		  int rows = wb.getSheet("UserData").getPhysicalNumberOfRows();
		 		  
		  //number of cells
		  int cells = wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
		 		  
		  data= new Object[rows-1][cells];
		  
	  
		  for(int r=1; r<rows; r++)
		  {
			  for(int c=0;c<cells;c++)
			  {
				  data[r-1][c]=wb.getSheet("UserData").getRow(r).getCell(c).getStringCellValue(); 
			  }
		  }
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
	  return data;
	}
}
