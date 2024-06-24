package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {
	
	@DataProvider(name="testdata1")
	public Object[][] testData()
	{
		Object data[][] = {{"Admin", "admin123"},{"Sarang", "Test123"},{"Admin","admin123"},{"pooja","test456"}};
		return data;
	}
	
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
		  System.out.println(rows);
		  
		  //number of cells
		  int cells = wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
		  System.out.println(cells);
		  
		  //create array as per file size
		  data= new Object[rows-1][cells];
		  
		  
		  //read data from file and save it in an array 
		  
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
	  
	  //workbook->sheet->raw->cell
	/*  
	  XSSFWorkbook wb= new XSSFWorkbook(fs);
	  
	  XSSFSheet sheet1 = wb.getSheet("UserData");
	  
	  XSSFRow row1= sheet1.getRow(1);
	  XSSFCell cell1 = row1.getCell(0);
	  
	  String value = cell1.getStringCellValue();
	  System.out.println(value);
	  */
//	  
//	  XSSFWorkbook wb = new XSSFWorkbook(fs);
//	  String value = wb.getSheet("UserData").getRow(4).getCell(0).getStringCellValue();
//	  System.out.println(value);
	  
	  
	  return data;
	}
}
