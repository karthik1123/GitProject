package GitHubProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Data4Excel {
			 
		private static XSSFSheet ExcelWSheet;

		private static XSSFWorkbook ExcelWBook;

		private static XSSFCell Cell;

		private static XSSFRow Row;

@Test
		public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   

	   String[][] tabArray = null;

	   try {
		   FileInputStream ExcelFile = new FileInputStream("C:\\GitHubRepository\\.git\\SeleniumFrameWork\\src\\main\\java\\resources\\Data4Excel.xls");
		   // Access the required test data sheet
		   ExcelWBook = new XSSFWorkbook(ExcelFile);
		   ExcelWSheet = ExcelWBook.getSheet("Data4Excel");

		   int startRow = 1;
		   int startCol = 1;
		   int ci,cj;
		   int totalRows = ExcelWSheet.getLastRowNum();
		   // you can write a function as well to get Column count
		   int totalCols = 2;
		   tabArray=new String[totalRows][totalCols];
		   ci=0;
		   for (int i=startRow;i<=totalRows;i++, ci++) {           	   
			  cj=0;
			   for (int j=startCol;j<=totalCols;j++, cj++){
				   tabArray[ci][cj]=getCellData(i,j);
				   System.out.println(tabArray[ci][cj]);  
					}
				}
			}
	   
		catch (FileNotFoundException e)
	   {
			System.out.println("Could not read the Excel sheet");
				}
	   
		catch (IOException e)
	   {
			System.out.println("Could not read the Excel sheet");
		}
	return tabArray;
		
	}

}	