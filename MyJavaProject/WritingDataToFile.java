import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingDataToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream MyExcel = new FileOutputStream("C:\\Intel\\My technical docs and videos\\My learnings so far\\Selenium\\DataDriven Testing Using Excel\\new_Data.xlsx");
		
		XSSFWorkbook mydatabook = new XSSFWorkbook();  // create an workbook object and get the file into the object
		
		XSSFSheet sheet = mydatabook.createSheet("Data2");  // get the sheet1 of excel into the myworkbook object. we can also use "sheet1" instead of 0.
		
		
		for(int i =0;i<=5;i++)
		{
			XSSFRow  CurrentRow = sheet.createRow(i);
			
			for(int j=0;j<5;j++)
			{
				CurrentRow.createCell(j).setCellValue("xyz");
			}
		}
		
		mydatabook.write(MyExcel);
		MyExcel.close();
		
		
		System.out.println("writing data into Excel is completed");
	}

}
