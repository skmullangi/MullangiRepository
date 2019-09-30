import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OnlineFixedDepositCalculator  {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the URL
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/indian-overseas-bank/fixed-deposit-calculator-IOB-BIO001.html");
		
	FileInputStream MyExcel1 = new FileInputStream("C:\\Intel\\My technical docs and videos\\My learnings so far\\Selenium\\DataDriven Testing Using Excel\\FD_Data.xlsx");
	
	XSSFWorkbook mydatabook = new XSSFWorkbook(MyExcel1);  // create an workbook object and get the file into the object
	
	XSSFSheet sheet = mydatabook.getSheet("Sheet1");  // get the sheet1 of excel into the myworkbook object. we can also use "sheet1" instead of 0.
	
	int numOfRows = sheet.getLastRowNum();  // to get the count of rows.
	
	System.out.println("no of rows" +numOfRows);
	
	for(int i=1;i<numOfRows;i++)
	{
	
		XSSFRow  CurrentRow = sheet.getRow(i);
		
		int principle = (int)CurrentRow.getCell(0).getNumericCellValue();

		System.out.println("Principle =" +principle);
 
		double ROI = (double)CurrentRow.getCell(1).getNumericCellValue();
		
    	System.out.println("Principle =" +ROI);

		
		int Period = (int)CurrentRow.getCell(2).getNumericCellValue();
		
		System.out.println("Period =" +Period);
		
		double  Maturity = (double)CurrentRow.getCell(3).getNumericCellValue();
	
		double roundedMaturity = Math.round(Maturity * 100.0) / 100.0;
		
		System.out.println("Expected Maturity =" +roundedMaturity);
		
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(principle));  // use string.valueOf to convert given data into text.
		
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String.valueOf(ROI));  // use string.valueOf to convert given data into text.
		
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(Period));  // use string.valueOf to convert given data into text.
		
		Select tenure = new Select(driver.findElement(By.xpath("//select[@name='tenurePeriod']")));
		
		tenure.selectByVisibleText("year(s)");
				
		Select frequency = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		
		frequency.selectByVisibleText("Compounded Yearly");
		
		driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]")).click();

String Mat_Amount = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[6]/div[1]/div[1]/div[4]/div[1]/div[2]/span[2]/strong[1]")).getText();

	driver.findElement(By.xpath("//img[@class='PL5']")).click();

System.out.println("the maturity amount = " +Mat_Amount);	
	
if(roundedMaturity==(Double.parseDouble(Mat_Amount)))
{

System.out.println("The Calculation is correct");

}

else
{
	
	System.out.println("The Calculation is wrong");	
		
	}

Thread.sleep(5000);

//Navigate to the URL
	  driver.get("https://www.moneycontrol.com/fixed-income/calculator/indian-overseas-bank/fixed-deposit-calculator-IOB-BIO001.html");
		
  }
	
	
	
}
	
}