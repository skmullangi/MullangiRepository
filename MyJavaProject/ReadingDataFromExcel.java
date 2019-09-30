import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileInputStream MyExcel = new FileInputStream("C:\\Intel\\My technical docs and videos\\My learnings so far\\Selenium\\DataDriven Testing Using Excel\\SampleData.xlsx");
			
		XSSFWorkbook myworkbook = new XSSFWorkbook(MyExcel);  // create an workbook object and get the file into the object
		
		XSSFSheet sheet = myworkbook.getSheetAt(0);  // get the sheet1 of excel into the myworkbook object. we can also use "sheet1" instead of 0.
		
		int numOfRows = sheet.getLastRowNum();  // to get the count of rows.
		
		int numOfColumns = sheet.getRow(0).getLastCellNum();  // to get the count of columns
		
		for(int i=0;i<numOfRows;i++)
		{
			
			XSSFRow  CurrentRow = sheet.getRow(i);   // focus on the current row
			
			
			for(int j=0;j<numOfColumns;j++)
			{
			String CellValue = CurrentRow.getCell(j).toString();  // get the cell value
			
			
			
			// to get the string data use getStringcellvalue() method
			// to get the numeric data use getNumericCellValue() method
			// to get boolean Data use getBooleanCellValue();
			
			System.out.print("       " +CellValue);
			}
	    
			System.out.println();
		}
		

	}
	
}

	
	
	
	