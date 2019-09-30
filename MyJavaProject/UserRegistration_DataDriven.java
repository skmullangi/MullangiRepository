import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration_DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the URL
		driver.get("http://newtours.demoaut.com");
		
		
		FileInputStream MyExcel = new FileInputStream("C:\\Intel\\My technical docs and videos\\My learnings so far\\Selenium\\DataDriven Testing Using Excel\\UserRegistration.xlsx");
		
		XSSFWorkbook mydatabook = new XSSFWorkbook(MyExcel);  // create an workbook object and get the file into the object
		
		XSSFSheet sheet = mydatabook.getSheet("Sheet1");  // get the sheet1 of excel into the myworkbook object. we can also use "sheet1" instead of 0.
		
		int numOfRows = sheet.getLastRowNum();  // to get the count of rows.
		
		System.out.println("no of rows" +numOfRows);
		
		int numOfColumns = sheet.getRow(0).getLastCellNum();  // to get the count of columns

		System.out.println("no of rows" +numOfColumns);

		
		for(int i=1;i<=numOfRows;i++)
		{
			//First_Name	Last_Name	Phone	Email	Address	City	State	Postal	Country	UserName	Password
			
			
			XSSFRow  CurrentRow = sheet.getRow(i);   // focus on the current row
			
			
			String First_Name = CurrentRow.getCell(0).toString(); 		// get the cell value
			String Last_Name = CurrentRow.getCell(1).toString();  //// get the cell value
			String Phone = CurrentRow.getCell(2).toString();   // get the cell value
			String Email = CurrentRow.getCell(3).toString();   // get the cell value
			String Address = CurrentRow.getCell(4).toString();  // get the cell value
			String City = CurrentRow.getCell(5).toString();  // get the cell value
			String State = CurrentRow.getCell(6).toString();  // get the cell value
			String Postal = CurrentRow.getCell(7).toString(); // get the cell value
			String Country = CurrentRow.getCell(8).toString();   // get the cell value
			String UserName = CurrentRow.getCell(9).toString();   // get the cell value
			String Password = CurrentRow.getCell(10).toString();   // get the cell value
			String conformPassword = CurrentRow.getCell(11).toString();   // get the cell value
			
			
		    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click(); ///click on register link
		    
		    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(First_Name);		    
		    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Last_Name);	
		    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Phone);
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Email);       //input[@id='userName']
		    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Address);
		    driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
		    driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
		    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(Postal);
		 //   driver.findElement(By.xpath("//input[@name='country']")).sendKeys(Country);
		   Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		    
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(conformPassword);
		    
		    driver.findElement(By.xpath("//input[@name='register']")).click();   //click on submit
		
		if(driver.getPageSource().contains("Thank you"))
		{
			System.out.println("Registration  completed for user  " +UserName);
		}
			else
			{		
				System.out.println("Registration not completed for user  " +UserName);
		}

		driver.get("http://newtours.demoaut.com");
	}

   }
}
