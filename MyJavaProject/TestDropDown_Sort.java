import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.WebElement;   //Web element is an interface
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDropDown_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String exePath = "C:\\Users\\GSR\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
	     
	     WebDriver driver = new ChromeDriver();
	
     driver.get("https://testautomationpractice.blogspot.com/");

     driver.manage().window().maximize();
     
     Select DrpBox= new Select(driver.findElement(By.xpath("//select[@id='speed']")));
     
     List OriginalList = new ArrayList(); 
     List TempList = new ArrayList();
     
     List <WebElement>options=DrpBox.getOptions();
     
     for(WebElement e:options)
     {
       	 OriginalList.add(e.getText());
       	 TempList.add(e.getText());
   	 	}

     System.out.println("Before sorting temp list " +TempList);
     
     Collections.sort(TempList);
     
     System.out.println("After sorting temp list " +TempList);
     
     if(OriginalList == TempList)
     {
    	 System.out.println("Dropdown is already sorted");
     }
     else
     {
    	 System.out.println("Dropdown is not sorted");
     }
     
    }
}
