package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcllDataRead {
  @Test
  public void DataRead() throws IOException 
  {
	  File f1 = new File("./"+"\\TestData\\Data.xlsx");
	  FileInputStream fs= new FileInputStream(f1);
	  
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
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
	  //number of rows
	  int rows = wb.getSheet("UserData").getPhysicalNumberOfRows();
	  System.out.println(rows);
	  
	  //number of cells
	  int cells = wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
	  System.out.println(cells);
	  
	  //create array as per file size
	  Object data[][]= new Object[rows-1][cells];
	  
	  
	  //read data from file and save it in an array 
	  
	  for(int r=1; r<rows; r++)
	  {
		  for(int c=0;c<cells;c++)
		  {
			  data[r-1][c]=wb.getSheet("UserData").getRow(r).getCell(c).getStringCellValue(); 
			  System.out.println(data[r-1][c]);
		  }
	  }
	  
	  
  }
}
